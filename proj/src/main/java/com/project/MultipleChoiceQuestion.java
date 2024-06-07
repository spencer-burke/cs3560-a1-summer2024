package com.project;

public class MultipleChoiceQuestion extends AQuestion {
    /**
     * Constructor for the Multiple Choice Question
     * @param questionString the question being used for the poll
     * @param numberOfAnswers the amount of optional answers being used for the poll
     */
    public MultipleChoiceQuestion(String questionString, int numberOfAnswers) { super(questionString, numberOfAnswers); }
}
