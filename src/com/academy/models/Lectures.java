package com.academy.models;

public class Lectures {
    private static long ID;
    public static long counter;
    private HomeWorks homeworks;
    private AdditionalMaterials additionalMaterials;

    public Lectures() {
        ID = counter++;
    }
}
