package Lesson3.Fruit;

import org.w3c.dom.ls.LSOutput;

public class RunClass {

    public static void main(String[] args){
    Orange[] oranges = new Orange[10];
        Orange orange0 = new Orange(1500);
        Orange orange1 = new Orange(1500);
        Orange orange2 = new Orange(1500);
        Orange orange3 = new Orange(1500);
        Orange orange4 = new Orange(1500);

        oranges[0] = orange0;
        oranges[1] = orange1;
        oranges[2] = orange2;
        oranges[3] = orange3;
        oranges[4] = orange4;

        Box<Orange> box1 = new Box<>(oranges);

        Apple[] apples = new Apple[10];
        Apple apple0 = new Apple(1000);
        Apple apple1 = new Apple(1000);
        Apple apple2 = new Apple(1000);
        Apple apple3 = new Apple(1000);

        apples[0] = apple0;
        apples[1] = apple1;
        apples[2] = apple2;
        apples[3] = apple3;

        Box<Apple> box2 = new Box<>(apples);

        Orange[] oranges2 = new Orange[10];

        oranges2[0] = orange0;
        oranges2[1] = orange1;
        oranges2[2] = orange2;

        Box<Orange> box3 = new Box<>(oranges2);

        System.out.println("Weight the first box " + box1.getWeightArray());
        System.out.println("Weight the next box " + box2.getWeightArray());


        System.out.println(box1.compare(box3));


        box1.toEmptyArray(box3);
        System.out.println("Weight the first box " + box1.getWeightArray());
        System.out.println("Weight the third box " + box3.getWeightArray());


    }

}

