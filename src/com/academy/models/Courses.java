package com.academy.models;

public class Courses {
    private static long ID;
    public static long counter;
    private Teachers teachers;
    private Students students;
    private Lectures lectures;

    public Courses() {
        ID = counter++;
    }
}
