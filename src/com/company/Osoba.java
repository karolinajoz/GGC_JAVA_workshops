package com.company;

public class Osoba {
    private String name;
    String lastName;
    //String nationality;
    private Gender gender;
    int age;

    public Osoba(String name, String lastName, int age, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
//    public Osoba (String name, String lastName, int age, String nationality) {
//        this(name, lastName, age);
//        this.nationality = nationality;
//    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                // ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        Osoba otherPerson = (Osoba) other;
        return this.name.equals(otherPerson.name) && this.lastName.equals(otherPerson.lastName) && this.gender == otherPerson.gender && this.age == otherPerson.age;
    }
}
