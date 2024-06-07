package com.project;

public class Student implements Comparable {
    private String id;
    private int choice;

    /**
     * Constructor for the student object
     * @param id the id for the student
     * @param choice the poll choice for the student
     */
    public Student(String id, int choice) {
        this.id = id; 
        this.choice = choice;
    }

    /**
     * Returns the id of the student
     * @return the student id
     */
    public String getID() { return id; }

    /**
     * Returns the student choice
     * @return choice
     */
    public int getChoice() { return choice; }

    /**
     * Checks if the id's are equal
     * @return if the argument is a student and has the same id
     */
    @Override
    public boolean equals(Object arg) {
        if (arg != null && arg instanceof Student)
            return this.id.compareTo( ((Student)arg).id) == 0;
        return false;
    }

    /**
     * Compare the student objects by their ids
     * @return compares the student objects by comparing the ids
     */
    @Override
    public int compareTo(Object arg) {
        if (arg != null && arg instanceof Student)
            return id.compareTo( ( (Student)arg ).id );
        return -1;
    }
}
