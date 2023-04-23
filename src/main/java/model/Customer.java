package model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private String customerName;
	private String customerFirstName;
	private String customerAdress;
	private String customerPhone;
	private String customerMail;

	public Customer() {

	}

	public Customer(String customerName, String customerFirstName, String customerAdress, String customerPhone,
			String customerMail) {
		super();
		this.customerName = customerName;
		this.customerFirstName = customerFirstName;
		this.customerAdress = customerAdress;
		this.customerPhone = customerPhone;
		this.customerMail = customerMail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerAdress() {
		return customerAdress;
	}

	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerFirstName=" + customerFirstName
				+ ", customerAdress=" + customerAdress + ", customerPhone=" + customerPhone + ", customerMail="
				+ customerMail + "]";
	}

}
