package com.invoice.demo.invoicenumberdemo.service;

import java.util.List;

import com.invoice.demo.invoicenumberdemo.entity.Invoice;

public interface InvoiceService {
	
	public Boolean save(Invoice inv);
	
	public List<Invoice> findAll();

}
