package com.project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Question has a list of answers and a question
 */
public abstract class AQuestion {
    private String questionString;
    private Answer answerList[];
    private List<Student> studentList;

    /**
     * Constructor for abstract question object
     * @param questionString the question being asked by the poll
     * @param numberOfAnswers the amount of optional answers within the poll
     */
    public AQuestion(String questionString, int numberOfAnswers) {
        this.questionString = questionString;
        this.studentList = new ArrayList<>();
        answerList = new Answer[numberOfAnswers];
    }

    /**
     * Adds an answer to the poll
     * @param answerToAdd the position in the list to add the answer
     * @param newAnswer the answer itself
     */
    public void addAnswer(int answerToAdd, Answer newAnswer) { answerList[answerToAdd] = newAnswer; }

    /**
     * Selects an answer in the list
     * @param answerToSelect the answer in the list to select
     */
    private void selectAnswer(int answerToSelect) { answerList[answerToSelect].select(); }

    /**
     * Submit's a student's answer
     * @param arg the student submitting an answer
     */
    public void submit(Student arg) {
        int studentIndex = studentList.indexOf(arg);
        // if the student is in the list, SUBTRACT COUNT FROM THAT ANSWER, replace it, and then select, also replace the student in the list
        if (studentIndex != -1) {
            // subtract count from answer
            answerList[studentList.get(studentIndex).getChoice()].decrementCount();
            // add the student with the new choice
            studentList.set(studentIndex, arg);
        }
        // if the student is not in the list append and select
        else {
            studentList.add(arg);
        }
        selectAnswer(arg.getChoice());
    }

    /**
     * Returns a copy list of answers
     * @return a new list of Answer objects
     */
    public Answer[] getAnswers() { return Arrays.copyOf(answerList, answerList.length); }

    /**
     * Return the question string of the poll
     * @return the question string
     */
    public String getQuestionString() { return questionString; }
}
