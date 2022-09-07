package Lesson1;

public class Members {

    private static String name;
    private static int dexterity;
    private static int intelligence;
    private static int mobility;
    private static int health;

    public Members(String name, int dexterity, int intelligence, int mobility, int health) {
        this.name = name;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.mobility = mobility;
        this.health = health;
    }

    public static String getName() {
        return name;
    }

    public static int getDexterity() {
        return dexterity;
    }

    public static int getIntelligence() {
        return intelligence;
    }

    public static int getMobility() {
        return mobility;
    }

    public static int getHealth() {
        return health;
    }
}

