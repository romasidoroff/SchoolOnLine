package com.academy.models;

public class Lectures {
    private static long ID;
    public long coursesID;

        public  Lectures(long ID, long coursesID) {
        this.ID = ID;
        this.coursesID = coursesID;
    }
        public static Lectures createLectures(long ID, long coursesID) {
        return new Lectures(ID, coursesID);
    }

    public long getID() {

        return this.ID;
    }
        public static long counter;
        private HomeWorks homeworks;
        private AdditionalMaterials additionalMaterials;

    public Lectures() {
        ID = counter++;
    }

    }




