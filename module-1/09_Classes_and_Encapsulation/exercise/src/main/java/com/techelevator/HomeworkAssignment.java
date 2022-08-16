package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks = 100;
    private final String submitterName;
    private String letterGrade;

    enum letterGrade{
        A,
        B,
        C
    }
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        double gradeToDecimal = ((double) earnedMarks) / possibleMarks;
        if(gradeToDecimal >= 0.9)
            return "A";
        if(gradeToDecimal >= 0.8)
            return "B";
        if(gradeToDecimal >= 0.7)
            return "C";
        if(gradeToDecimal >= 0.6)
            return "D";
        else
            return "F";
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
}
