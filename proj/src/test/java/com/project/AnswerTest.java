package com.project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnswerTest {
    
    @Test
    public void answerCountTest() {
        Answer answerList[] = new Answer[3];

        for (int i = 0; i < 3; i++) {
            answerList[i] = new Answer(String.format("This is answer %d", i+1));
        }

        for (int i = 0; i < 7; i++) { answerList[0].select(); }
        for (int i = 0; i < 4; i++) { answerList[1].select(); }
        for (int i = 0; i < 12; i++) { answerList[2].select(); }

        assertTrue(answerList[0].getCount() == 7 && answerList[1].getCount() == 4 && answerList[2].getCount() == 12);
    }
}
