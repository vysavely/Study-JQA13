package ru.my.git.tests;


public class Main {
    public static void main(String[] args) {
        Product book = new Book(
                1,
                "Моя весна",
                200,
                "Вася Пупкин",
                100,
                1947
        );
        Product Tshirt = new Tshirt(
                2,
                "Футболка х/б",
                40,
                "Красный"
        );
        //book.setPrice(12_000);
        System.out.println(book.isTooExpensive());
        System.out.println();
        book.use();
        Tshirt.use();
    }
}