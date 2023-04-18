package ru.javacore;

public class Tester {
    String name;
    String surname;
    int exp;
    String englishLevel;
    float salary;

    public Tester(String name, String surname, int exp, String englishLevel, float salary){
        this(name, surname);
        this.name = name;
        this.surname = surname;
        this.exp = exp;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public Tester(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.exp = 2;
        this.englishLevel = "2a";
        this.salary = 1200;
    }
    public Tester(){
        this.name = ".";
        this.surname = ",";
        this.exp = 2;
        this.englishLevel = "A1";
        this.salary = 1200;
    }

    public void getFullName(){
        System.out.println(name + " " + surname);
    }
    public void getFullName(String name){
        System.out.println(surname);
    }
    public void getFullName(String name, String surname){
        System.out.println(name + " " + surname);
    }

    static void print(){
        System.out.println("привет");
    }
}