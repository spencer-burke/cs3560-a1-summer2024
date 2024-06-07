package com.project;
import java.util.List;

/*
 * Creates a question
 */
/*
 * Question:
 * - list of answers
 * - list of students
 * - prompt to get results
 */
/*
 * Student:
 * - really just an id
 */
/*
 * VotingService:
 * - prompts for question
 * - configures question
 * - calls the question prompt
 * - prompts for a second question
 */
/*
 * SimulationDriver:
 * - Calls VotingService
 */
public class VotingService {
    private AQuestion question;

    /**
     * Set the question to the parameter
     * @param question the question the Voting Service will manage
     */
    public void configurePoll(AQuestion question) { this.question = question; }

    /**
     * Allows a student to submit an answer to the poll
     * @param arg the list of students to submit to the poll question
     */
    public void submit(List<Student> arg) { 
        for (Student curr : arg)
            question.submit(curr);
    }

    /**
     * Output all of the results for the poll
     */
    public void outputResults() {
        Answer results[] = question.getAnswers();
        System.out.println("===Outputing Results From Poll===");
        System.out.println(String.format("[*] poll question: %s", question.getQuestionString()));
        for (Answer curr : results)
            System.out.println(String.format("[*] %s : %d", curr.getOption(), curr.getCount()));
    }

}
