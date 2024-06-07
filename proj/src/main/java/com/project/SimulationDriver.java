package com.project;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class SimulationDriver {

    /*
     * The student id will be 3 randomly generated digits
     */
     public static String generateID() {
        Random generator = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++)
            result.append(Integer.toString(generator.nextInt(10)));
        return result.toString();
     }

    public static void main(String[] args) {
        VotingService service = new VotingService();

        //configure the multiple choice question by adding students and answers
        AQuestion multipleChoiceQuestion = new MultipleChoiceQuestion("What is the best programming language?", 5);
        String options[] = {"C++", "C", "C#", "Rust", "Python"};
        for (int i = 0; i < 5; i++)
            multipleChoiceQuestion.addAnswer(i, new Answer(options[i]));
        List<Student> studentListOne = new ArrayList<>();
        Random generator = new Random();

        // generate the students
        for (int i = 0; i < 10; i++)
            studentListOne.add(new Student(generateID(), generator.nextInt(5)));

        // run the poll
        service.configurePoll(multipleChoiceQuestion);
        service.submit(studentListOne);
        service.outputResults();

        //configure the binary question by adding students and answers
        AQuestion binaryQuestion = new BinaryQuestion("Is vscode good?");
        List<Student> studentListTwo = new ArrayList<>();
        Answer answerOne = new Answer("yes");
        Answer answerTwo = new Answer("no");
        // generate the yes students
        for (int i = 0; i < 3; i++)
            studentListTwo.add(new Student(generateID(), 0));
        // generate the no students
        for (int i = 0; i < 2; i++)
            studentListTwo.add(new Student(generateID(), 1));
        Student copyStudent = new Student(studentListTwo.get(3).getID(), 0);
        studentListTwo.add(copyStudent);
        binaryQuestion.addAnswer(0, answerOne);
        binaryQuestion.addAnswer(1, answerTwo);

        // run the poll
        service.configurePoll(binaryQuestion);
        service.submit(studentListTwo);
        service.outputResults();
    }
}
