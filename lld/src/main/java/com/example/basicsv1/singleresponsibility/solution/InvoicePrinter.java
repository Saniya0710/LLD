package com.example.basicsv1.singleresponsibility.solution;

public class InvoicePrinter {
    Invoice invoice;
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void printInvoice() {
        System.out.println("Printing invoice for " + invoice.marker.name + "  marker");

    }
}
