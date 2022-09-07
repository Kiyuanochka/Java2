package Lesson1;

public class Course {
    public static void main(String[] args) {
        String[] Courses = new String[4];
        Courses[0] = "Jump";
        Courses[1] = "Run";
        Courses[2] = "Swim";
        Courses[3] = "Crawl";

    }
        public void doIt(String[] arr) {
            String[] Courses = new String[4];
            Courses[0] = "Jump";
            Courses[1] = "Run";
            Courses[2] = "Swim";
            Courses[3] = "Crawl";


        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < Courses.length; j++) {
            System.out.print(arr[i] + " " + Courses[j] + " ");
         }
            System.out.println();
        }

    }}

