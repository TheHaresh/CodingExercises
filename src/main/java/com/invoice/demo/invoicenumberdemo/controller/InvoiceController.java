package com.invoice.demo.invoicenumberdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.invoice.demo.invoicenumberdemo.entity.Invoice;
import com.invoice.demo.invoicenumberdemo.service.InvoiceService;

@Controller
public class InvoiceController {
	
	private InvoiceService invoiceService;
	
	@Autowired
	public InvoiceController(InvoiceService theInvoiceService) {
		
		invoiceService = theInvoiceService;

	}
	
	@RequestMapping("/")
	public String addInvoiceNum(Model model) {
		
		List<Invoice> inv =  invoiceService.findAll();
		
		model.addAttribute("number",inv);
	
		return "index";
	}
	
	@RequestMapping("/addNew")
	public String addNewInvoiceNum(Model model) {
		
		model.addAttribute("number", new Invoice()); 
	
		return "AddInvoice";
	}
	
	@PostMapping("/saveInvoiceNum")
	public String saveInvoice(@Valid @ModelAttribute("number") Invoice inv, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			
			return "AddInvoice";
		}else {			
			
		 Boolean result = invoiceService.save(inv);
			
		 if(result == true) {
			 return "errorPage";
		 }else {
			 
			 return "success";
		 }			
			
		}
	}
	
	@RequestMapping("/err")
	public String addErrorMsg(Model model) {
		
		Invoice inv = new Invoice();
		//inv.setErrMsg("KSEB Invoice number must have 13 digits");
		model.addAttribute("number",inv);
	
		return "AddInvoice";
	}

}
