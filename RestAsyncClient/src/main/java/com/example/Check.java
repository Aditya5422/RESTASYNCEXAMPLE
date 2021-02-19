package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Check {
	private String checkNumber;
	private String accNumber;
	private String amount;
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Check() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
