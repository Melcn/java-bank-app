package bankapp.model;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -4937812758111456354L;

	private String accountOwner;
	private Integer accountNumber;
	private double accountBalance;

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Account [accountOwner = " + accountOwner + ", accountNumber = " + accountNumber + ", accountBalance = "
				+ accountBalance + "]";
	}

}
