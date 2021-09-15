package ru.mirea.task5.opt1;

public class Dish {
    private String type;
    private int metal_ornament;
    private int heigth;

    public Dish(String type, int metal_ornament, int heigth) {
        this.type = type;
        this.metal_ornament = metal_ornament;
        this.heigth = heigth;
    }

    public String getType() {
        return type;
    }

    public int getMetal_ornament() {
        return metal_ornament;
    }

    public int getHeigth() {
        return heigth;
    }
}
