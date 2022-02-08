package com.company;

public class Programmer extends Person {

    String companyName;

    public Programmer(String name, String designation, String companyName) {
        this.name = name;
        this.designation = designation;
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println(name + " is coding in " + companyName + " and becoming better at his " + designation);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
