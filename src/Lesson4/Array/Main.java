package Lesson4.Array;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static String[] Array = {"Luck", "Wish", "Wish", "Get", "Luck", "Get", "Set", "Luck", "Get", "Luck"};

    public static void main(String args[]) {
        HashSet<String> targetSet = new HashSet<>(List.of(Array));
        System.out.println(targetSet);
        HashMap<String, Integer> result = new HashMap<>();
        for (String str : targetSet) {
            result.put(str, count(str));

        }
        System.out.println(result);


    }

    public static Integer count(String str) {
        Integer result = 0;
        for (String strThis : Array) {
            if (strThis.equals(str)) result++;

        }
        return result;
    }
}

