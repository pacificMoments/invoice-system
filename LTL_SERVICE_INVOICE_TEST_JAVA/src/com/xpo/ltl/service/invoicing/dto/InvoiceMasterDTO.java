package com.xpo.ltl.service.invoicing.dto;

import java.util.Calendar;

public class InvoiceMasterDTO {

	String masterKey;
	String debtorKey;
	Calendar invoiceDt;
	
	public String getMasterKey() {
		return masterKey;
	}
	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}
	public String getDebtorKey() {
		return debtorKey;
	}
	public void setDebtorKey(String debtorKey) {
		this.debtorKey = debtorKey;
	}
	public Calendar getInvoiceDt() {
		return invoiceDt;
	}
	public void setInvoiceDt(Calendar invoiceDt) {
		this.invoiceDt = invoiceDt;
	}
}
