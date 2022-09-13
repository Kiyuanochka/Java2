package Lesson2;

public class Main {
    static String[][] arraySizeException = {{"1", "2"}, {"3", "2"}, {"3", "4"}, {"3", "4"}};
    static String[][] arrayDataException = {{"1", "2", "3", "u"}, {"3", "2", "3", "4"}, {"3", "4", "3", "8"}, {"6", "3", "4", "3"}};
    static String[][] arrayWithNoError = {{"1", "2", "3", "8"}, {"3", "2", "3", "4"}, {"3", "4", "3", "8"}, {"6", "3", "4", "3"}};

    static int sizeA = 4;
    static int sizeB = 4;

    public static void main(String[] args) {
        try {
            System.out.println( "Sum: " + getSumm(arrayWithNoError));}
        catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());

        }
        try {
            System.out.println( "Sum: " + getSumm(arraySizeException));}
        catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());

        }
        try {
            System.out.println( "Sum: " + getSumm(arrayDataException));}
        catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());

        }

    }

        static void checkValue (String[][]array) throws MyArraySizeException {
            if (array.length != sizeA || array[0].length != sizeB) throw new MyArraySizeException();
        }

        static Integer getSumm(String[][] array) throws MyArraySizeException, MyArrayDataException {
            checkValue(array);
            Integer result = 0;
            int i = 0;
            int j = 0;
            try {
                for (; i < array.length; i++) {
                j = 0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }}
            } catch (NumberFormatException ex) {
                throw new MyArrayDataException("Error in the position number " + i + "," + j);

            }
            return result;
        }

        public static class MyArraySizeException extends Exception {
            MyArraySizeException() {
                super("The size is no correct");
            }
        }
        public static class MyArrayDataException extends Exception {
            MyArrayDataException(String message) {
                super(message);
            }
        }


    }
