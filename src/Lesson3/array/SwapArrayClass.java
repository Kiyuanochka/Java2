package Lesson3.array;

public class SwapArrayClass<T> {

    T intermediate;

    public T[] SwapElements(T[] array, int IndexA, int IndexB) {
        intermediate = array[IndexA];
        array[IndexA] = array[IndexB];
        array[IndexB] = intermediate;
        return array;

    }
}