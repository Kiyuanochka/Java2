package Lesson3.array;

import java.util.Arrays;

public class Main1 {

    static String[] ArrayString = {"Zero", "One", "Two", "Three"};
    static Integer[] ArrayInteger = {20, 200, 2000, 20000};
    static Double[] ArrayDouble = {20d, 200d, 2000d, 20000d};

    public static void main(String[] args){

        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
        try{
            System.out.println(Arrays.toString(swapArrayClass.SwapElements(ArrayString, 0, 1)));
        }
            catch(ArrayIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            }
            try{
                System.out.println(Arrays.toString(swapArrayClass.SwapElements(ArrayInteger, 0, 1)));
            }
            catch(ArrayIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            }
            try{
            System.out.println(Arrays.toString(swapArrayClass.SwapElements(ArrayDouble, 0, 1)));
            }
            catch(ArrayIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            }

        }
    }

