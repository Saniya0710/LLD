package com.example.basicsv1.singleresponsibility.violation;

public class ViolationDemo {
    
    public static void main(String[] args) {
        Marker marker = new Marker("Luxor", "Blue", 10, 2020);
        Invoice invoice = new Invoice(marker, 5);
        invoice.calculateTotalPrice();
        invoice.printInvoice();
        invoice.saveToDB();
    }
    }
