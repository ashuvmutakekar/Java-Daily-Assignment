package accounts;

import java.time.LocalDate;

import accountTester.AccountType;

public class Account {
	public static final int MIN_BAL = 1000;
	Integer accNo;
	String accName;
	LocalDate DateOfOpening;
	Double balance;
	public AccountType at;
	
	
	public Account(Integer accNo, String accName, LocalDate dateOfOpening, Double balance,AccountType at) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		DateOfOpening = dateOfOpening;
		this.balance = balance;
		this.at=at;
	}
	public Account() {
		super();
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public LocalDate getDateOfOpening() {
		return DateOfOpening;
	}
	public void setDateOfOpening(LocalDate dateOfOpening) {
		DateOfOpening = dateOfOpening;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public AccountType getAt() {
		return at;
	}
	public void setAt(AccountType at) {
		this.at = at;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", DateOfOpening=" + DateOfOpening + ", balance="
				+ balance + ", at=" + at + "]";
	}
	
	
	
}
