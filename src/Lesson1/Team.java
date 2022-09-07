package Lesson1;

import java.util.Arrays;

public class Team {

    private String name;
    private Members[] peoples;

    public Team(String name, Members[] peoples) {
        this.name = name;
        this.peoples = peoples;
    }
    public String getName() {
        return name;
    }

    public Members[] getPeoples() {
        return peoples;
    }
}

