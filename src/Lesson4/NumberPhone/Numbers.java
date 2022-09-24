package Lesson4.NumberPhone;

import java.util.HashMap;


public class Numbers {

    private HashMap<String, String> stringStringHashMap = new HashMap<>();


    public void add(String number, String fio) {
        stringStringHashMap.put(number, fio);
    }

    public String getNumberByFio(String fio) {
        if (stringStringHashMap.containsValue(fio)) {
            String result = "number: ";
            for (String key : stringStringHashMap.keySet()){
                if (stringStringHashMap.get(key).equals(fio)) result += key + "; "; }
            return result;
        } else return "Didn't find";


    }


}
