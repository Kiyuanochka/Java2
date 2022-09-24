package Lesson4.NumberPhone;


public class Main {

    public static void main(String args[]) {

        Numbers numbers = new Numbers();
        numbers.add("000", "QWE");
        numbers.add("111", "QYU");
        numbers.add("222", "QWE");
        numbers.add("333", "CHN");
        numbers.add("444", "DJI");
        numbers.add("555", "DYT");

        System.out.println(numbers.getNumberByFio("QWE"));
        System.out.println(numbers.getNumberByFio("333"));
    }


}

