package com.example.basicsv1.openclosed.solution;
import com.example.basicsv1.singleresponsibility.solution.Invoice;
import com.example.basicsv1.singleresponsibility.solution.Marker;

public class SolutionDemo {
    public static void main(String[] args) {
        
        System.out.println("Demonstrating Open Closed Principle Solution");
        Invoice invoice = new Invoice(new Marker("luxor", "red", 5, 2023), 8);
        invoice.calculateTotalPrice();
        InvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save();
        InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save();
    }
}
