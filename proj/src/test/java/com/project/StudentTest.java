package com.project;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentTest {
    
    @Test
    public void shouldAnswerWithTrue() {
        Student one = new Student("1234", 0);
        Student two = new Student("5678", 1);
        Student theFinal = new Student("1234", 3);
        List<Student> theList = new ArrayList<>();
        theList.add(one);
        theList.add(two);
        boolean result = theList.contains(theFinal);
        assertTrue(result);
    }

}
