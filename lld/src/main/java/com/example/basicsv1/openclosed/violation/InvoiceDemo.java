package com.example.basicsv1.openclosed.violation;

import com.example.basicsv1.singleresponsibility.solution.Invoice;
import com.example.basicsv1.singleresponsibility.solution.Marker;

public class InvoiceDemo {
 public static void main(String[] args) {
        System.out.println("Demonstrating Open Closed Principle Violation");
        Invoice invoice = new Invoice(new Marker("luxor", "red", 5, 2023), 8);
        invoice.calculateTotalPrice();
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();
        invoiceDao.saveToFile();
     }

}
