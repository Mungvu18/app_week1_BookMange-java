package book;

import java.util.Scanner;

public class Book {
    String name;
    String author;
    int price;
    int number;
    Double weight;


    public Book(String name, String author, int price, int number, Double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.number = number;
        this.weight = weight;
    }

    public Book() {
    }

    public int getPrice() {
        return this.price;
    }
    public double getTotalPrice(){
        return this.price*this.number;
    }
    public double getTotalWeight(){
        return this.weight*this.number;
    }
}