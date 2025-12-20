package com.mycompany.mavenproject1;

public class PaperBook extends Book implements Prometable {

    private double weight;

    public PaperBook(String title, String author, Double price, Double weight) {
        super(title, author, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PaperBook{" + super.toString() + ", weight=" + weight + "kg}";
    }

    @Override
    public void applyDiscount(double percentage) {
        double currentPrice = getPrice();
        
        double amountOFF = currentPrice * (percentage/100);
        double newPrice = currentPrice - amountOFF;
        
        setPrice(newPrice);
        System.out.println("New Price Is: " + newPrice);
    }

}
