package com.example.basicsv1.openclosed.violation;

import com.example.basicsv1.singleresponsibility.solution.Invoice;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveToDB() {
        System.out.println(invoice);
        System.out.println("Saving invoice to DB for "  + " marker");
    }
    public void saveToFile() {
        System.out.println("Saving invoice to File for "  + " marker");
    }
}