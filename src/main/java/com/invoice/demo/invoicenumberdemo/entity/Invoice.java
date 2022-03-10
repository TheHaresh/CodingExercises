package com.invoice.demo.invoicenumberdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="invoice_num")
	@Pattern(regexp="^[0-9]{13}$", message="KSEB Invoice number must have 13 digits")
	private String invoiceNum;
	
	//private String errMsg;
	
	public Invoice() {
		
	}
	
	public Invoice(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}


	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceNum=" + invoiceNum + "]";
	}

	/*public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}*/
	
	

}
