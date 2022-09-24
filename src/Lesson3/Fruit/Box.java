package Lesson3.Fruit;

public class Box <T extends Fruit> {

    T[] fruitArray;


    public T[] getFruitArray () {
        return fruitArray;
    }
    public Box(T[] fruitArray) {
        this.fruitArray = fruitArray;}

        public Integer getWeightArray() {
            Integer result = 0;
            for (T t : getFruitArray()) {
                if (t != null) {
                    Integer value = t.getWeightForOne();
                    result = result + value;
                }
            }
                return result;

            }
    public Boolean compare(Box<? extends Fruit> box) {
        if (this.getWeightArray().intValue() == box.getWeightArray().intValue())
            return true;
        return false;
    }
    public void toEmptyArray(Box<T> box){
        System.out.println("In the this box " + this.getWeightArray());
        System.out.println("In the next box " + box.getWeightArray());
        for (int i=0; i<box.getFruitArray().length; i++){
        if(box.getFruitArray()[i]!=null){
            this.getFruitArray()[getSize()] = box.getFruitArray()[i];
            box.getFruitArray()[i]=null;}
    }


    }
    public int getSize(){
    int result = 0;
    for (T t:getFruitArray()){
        if(t!=null)result++;}
        return result;
    }

}