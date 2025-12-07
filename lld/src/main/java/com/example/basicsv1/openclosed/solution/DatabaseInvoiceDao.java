package com.example.basicsv1.openclosed.solution;
import com.example.basicsv1.singleresponsibility.solution.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao  {
    
    Invoice invoice;
    public DatabaseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving invoice to database");
    }
}