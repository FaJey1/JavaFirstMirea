package ru.mirea.task5.opt2;

public class Doggy {
    private String name;
    private String breed;
    private Integer age;
    private Double weight;

    public Doggy(String n, String b, Integer a, Double w){
        this.name = n;
        this.breed = b;
        this.age = a;
        this.weight = w;
    }

    public String output(){
        return (name + " ,порода" + breed+" ,возраст" + age.toString() + " ,вес" + weight.toString());
    }
}
