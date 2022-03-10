package com.invoice.demo.invoicenumberdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.demo.invoicenumberdemo.dao.InvoiceRespository;
import com.invoice.demo.invoicenumberdemo.entity.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	private InvoiceRespository invoiceRespository;
	
	
	@Autowired
	public InvoiceServiceImpl(InvoiceRespository theInvoiceRespository) {
		invoiceRespository = theInvoiceRespository;
	}



	@Override
	public Boolean save(Invoice inv) {
		
		
		Boolean result = invoiceRespository.existsByInvoiceNum(inv.getInvoiceNum());
		
		if(result == false) {
		
		invoiceRespository.save(inv);
		
		}
		
		return result;

	}


	@Override
	public List<Invoice> findAll() {
		return invoiceRespository.findAll();
	}

}
