package ru.my.git.tests;

public class Tshirt extends Product {
    private String color;

    public Tshirt(int id, String name, int price, String color) {
        super(id, name, price);
        this.color = color;

    }

    @Override
    public void use() {
        System.out.println("Носим футболку " + name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
