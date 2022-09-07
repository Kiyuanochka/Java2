package Lesson1;

import java.lang.reflect.Member;

public class RunClass {

    public static void main(String[] args) {

        Members[] Members = new Members[4];
        Members[0] = new Members("VR", 17, 18,290, 560);
        Members[1] = new Members("VD", 13, 22,300, 560);
        Members[2] = new Members("PA", 23, 15,348, 580);
        Members[3] = new Members("Ursa", 18, 16,310, 700);


        Team team = new Team("Team", Members);

        Course Course= new Course(300, 15, 500, 20);


        String result = Course.doIt(team);
        System.out.println(result);
}
}

