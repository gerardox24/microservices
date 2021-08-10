package com.baufest.store.shopping.service;

import com.baufest.store.shopping.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    public List<Invoice> findAllInvoices();
    public Invoice createInvoice(Invoice invoice);
    public Invoice updateInvoice(Invoice invoice);
    public Invoice deleteInvoice(Invoice invoice);
    public Invoice getInvoice(Long id);
}
