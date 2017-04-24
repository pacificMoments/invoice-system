package com.xpo.ltl.service.invoicing.dto;

public class InvoiceMasterDTO {

	String masterKey;
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
	String debtorKey;
}
