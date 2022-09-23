package Lesson3.Fruit;

public abstract class Fruit {
    private String name;
    private int WeightForOne;


    public Fruit(String name, int weightForOne) {
        this.name = name;
        this.WeightForOne = weightForOne;

    }

    public String getName() {
        return name;
    }

    public int getWeightForOne() {
        return WeightForOne;
    }
}
