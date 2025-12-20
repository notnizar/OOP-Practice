package com.mycompany.mavenproject1;

public abstract class Book {

    private String title;
    private String author;
    private Double price;
    private static int count;

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        setPrice(price);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Inviled Input");
        }
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + '}';
    }
}
