package Lesson1;

public class Members {

    private String name;

    private int dexterity;
    private int intelligence;
    private int mobility;
    private int health;

    public Members(String name, int dexterity, int intelligence, int mobility, int health) {
        this.name = name;

        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.mobility = mobility;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMobility() {
        return mobility;
    }

    public int getHealth() {
        return health;
    }


}

