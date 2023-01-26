package com.academy.models;

public class Lectures {
    private static long ID;
    public static String name;
    public long coursesID;

        public  Lectures(long ID, long coursesID, String name) {
        this.ID = ID;
        this.coursesID = coursesID;
        this.name = name;
        }



    @Override
    public String toString() {
        return "New Lections number " + ID + " courses number"+ coursesID + "  new name";
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




