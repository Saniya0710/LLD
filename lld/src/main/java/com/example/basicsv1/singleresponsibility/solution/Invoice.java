package com.example.basicsv1.singleresponsibility.solution;

public class Invoice {
    public Marker marker;
    private final int quantity;   
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotalPrice() {
        System.out.println("Calulating total price for " + marker.name + " marker");
        this.total = this.marker.price * this.quantity;
    }

    public int getTotal() {
        return this.total;
    }
}
