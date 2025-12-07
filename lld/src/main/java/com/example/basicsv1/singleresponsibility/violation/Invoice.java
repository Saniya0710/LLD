package com.example.basicsv1.singleresponsibility.violation;

public class Invoice {
    Marker marker;
     int quantity;
    int totalPrice;


    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotalPrice() {

       System.out.println("Calculating total price for" + marker.name + " marker");
        totalPrice = marker.price * quantity;   
    }
    public void printInvoice() {
        System.out.println("Printing invoice for " +  marker.name + " marker");
    }
    public void saveToDB() {
        System.out.println("Saving to DB for " + marker.name + " marker");
    }
}
