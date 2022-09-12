package Lesson2;

public class MyTestClass<arr> {
    int i;
    int j;

    public void test1(String[][] arr) throws MyArraySizeException {


        if (arr[i][j] != arr[4][4]) throw new MyArraySizeException("Size isn't correct");
    }

    private void processLine(String[] strings) {

        String[][] str = {{"1", "2", "3", "8"}, {"3", "2", "3", "4"}, {"3", "4", "3", "8"}, {"6", "3", "4", "3"}};
        Integer[] array=new Integer[strings.length];
        int i=0;
        for(String str:strings){
            array[i]=Integer.parseInt(str);
            i++;
        }
    }

}
