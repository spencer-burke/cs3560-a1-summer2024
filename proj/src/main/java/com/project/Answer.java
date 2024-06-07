package com.project;

public class Answer {
    private String option;
    private int count;

    /**
     * Instantiate the Answer object and increase the static count
     * @param option the string that the option for the answer
     */
    public Answer(String option) { 
        this.option = option; 
        count = 0;
    }

    /**
     * Return the option of the answer
     * @return the option of the answer
     */
    public String getOption() { return option; }

    /**
     * Return the count of the current answer
     * @return the count of the current answer
     */
    public int getCount() { return count; }

    /**
     * Select the answer by updating it's count
     */
    public void select() { count++; }

    /**
     * Decrease the count by one in case there is a duplicate
     */
    public void decrementCount() { count--; }

    /**
     * Convert the object to a string representation which is the id
     * @return the id 
     */
    @Override
    public String toString() { return getOption(); }

}
