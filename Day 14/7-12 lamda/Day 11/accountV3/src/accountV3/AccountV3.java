package accountV3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

import Exception.MinBalanceException;

public class AccountV3 implements Comparable<AccountV3>,Comparator<AccountV3>{
	Integer accNo;
	String accName;
	LocalDate DateOfOpening;
	Double balance;
	public static final double MIN_BAL=1000;
	public AccountV3() {
		super();
	}
	public AccountV3(Integer accNo, String accName, LocalDate dateOfOpening, Double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		DateOfOpening = dateOfOpening;
		this.balance = balance;
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
	@Override
	public String toString() {
		return "AccountV3 [accNo=" + accNo + ", accName=" + accName + ", DateOfOpening=" + DateOfOpening + ", balance="
				+ balance + "]";
	}
	@Override
	public int compareTo(AccountV3 o) {
		// TODO Auto-generated method stub
		return this.accName.compareTo(o.accName);
	}
	@Override
	public int compare(AccountV3 o1, AccountV3 o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.accNo,o1.accNo);
	}
	
}
