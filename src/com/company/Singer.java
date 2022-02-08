package com.company;

public class Singer extends Person {

    String bandName;

    public Singer(String name, String designation, String bandName) {
        this.name = name;
        this.designation = designation;
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(name + " is singing in the " + bandName + " band and becoming better at his " + designation);
    }

    public void playGitar() {
        System.out.println(name + " is playing gitar in the " + bandName + " band");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
