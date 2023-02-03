package com.academy.models;


public class Lectures {

    public static long ID;
    public static String name;
    public long coursesID;
    public static  String lecturesName;

        public  Lectures(long ID, long coursesID, String lecturesName) {
        this.ID = ID;
        this.coursesID = coursesID;
        this.lecturesName = lecturesName;
        }



    @Override
    public String toString() {
            return "New Lectures number:" + ID + " courses number:"+ coursesID + " name:" + lecturesName;
    }

    public static  Lectures createLectures(long ID, long coursesID, String name) {

            return new Lectures(ID, coursesID, name);
    }



    public static long getID() {

        return ID;
    }
        public static long counter;
        private HomeWorks homeworks;
        private AdditionalMaterials additionalMaterials;

   public Lectures() {

        ID = counter++;
    }


}




