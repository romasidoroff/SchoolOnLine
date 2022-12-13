package com.academy.models;

public class Courses {
    private static long ID;
    public Courses(long ID){
        this.ID = ID;
    }
    public long getID() {

        return ID;
    }
    public static long counter;
    private Teachers teachers;
    private Students students;
    private Lectures lectures;

    public Courses() {
        ID = counter++;
    }
}
