package Lesson1;

import java.util.Arrays;

public class Team {

    public static void main(String[] args) {

        Course c = new Course();
        Team team = new Team();
        String[] Members = new String[4];

       Members[0] = "QQQ";
       Members[1] = "AAA";
       Members[2] = "ZZZ";
       Members[3] = "XXX";

        System.out.println(" Members of the Team: " + Arrays.toString(Members));


        c.doIt(Members);



        //team.showResults(); // Показываем результаты
    }}




