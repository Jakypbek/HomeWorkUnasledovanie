package com.company;

public class Dancer extends Person {

    String groupName;

    public Dancer(String name, String designation, String groupName) {
        this.name = name;
        this.designation = designation;
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(name + " is dancing in the " + groupName + " group and becoming better at his " + designation);
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
