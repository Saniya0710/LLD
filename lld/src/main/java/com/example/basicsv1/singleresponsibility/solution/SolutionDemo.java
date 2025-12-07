package com.example.basicsv1.singleresponsibility.solution;

public class SolutionDemo {
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Single Responsibility Principle Solution");
        Marker marker = new Marker("Luxor", "Blue", 10, 2020);
        Invoice invoice = new Invoice(marker, 5);
        InvoicePrinter printer = new InvoicePrinter(invoice);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);    
        invoice.calculateTotalPrice();
        printer.printInvoice();
        invoiceDao.saveToDB();
    }
}



