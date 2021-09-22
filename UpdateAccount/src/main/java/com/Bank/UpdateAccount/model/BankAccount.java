package com.Bank.UpdateAccount.model;


import org.springframework.data.annotation.Id;

public class BankAccount {
	private String id;
	@Id
	private long customerId;
	private String customerName;
	private String userName;
	private String password;
	private String customerAddress;
	private String customerState;
	private String customerCountry;
	private String customerEmailId;
	private String customerPan;
	private String customerMobileNumber;
	private String customerdob;
	private String accountType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long id2) {
		this.customerId = id2;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerPan() {
		return customerPan;
	}

	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerdob() {
		return customerdob;
	}

	public void setCustomerdob(String customerdob) {
		this.customerdob = customerdob;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BankAccount(String id,long customerId, String customerName, String userName, String password,
			String customerAddress, String customerState, String customerCountry, String customerEmailId,
			String customerPan, String customerMobileNumber, String customerdob, String accountType) {
		super();
		this.id=id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
		this.customerAddress = customerAddress;
		this.customerState = customerState;
		this.customerCountry = customerCountry;
		this.customerEmailId = customerEmailId;
		this.customerPan = customerPan;
		this.customerMobileNumber = customerMobileNumber;
		this.customerdob = customerdob;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName + ", userName="
				+ userName + ", password=" + password + ", customerAddress=" + customerAddress + ", customerState="
				+ customerState + ", customerCountry=" + customerCountry + ", customerEmailId=" + customerEmailId
				+ ", customerPan=" + customerPan + ", customerMobileNumber=" + customerMobileNumber + ", customerdob="
				+ customerdob + ", accountType=" + accountType + "]";
	}

}