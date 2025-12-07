package com.example.basicsv1.singleresponsibility.solution;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving invoice for " + invoice.marker.name + " marker to DB");
    }
}
