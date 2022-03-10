package com.invoice.demo.invoicenumberdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.invoice.demo.invoicenumberdemo.entity.Invoice;

public interface InvoiceRespository extends JpaRepository<Invoice, Integer> {
	
	Boolean existsByInvoiceNum(String invoiceNum);

}
