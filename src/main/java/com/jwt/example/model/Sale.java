package com.jwt.example.model;

import java.sql.Date;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String item;
	
	private Date shopDate;
	
private String mobileNo;
private String customerName;
private String address;
private String state;
private Date dateOfBirth;
private boolean minor;
private int quantity;
private double price;
private double payAmount;
private String emailId;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public Date getShopDate() {
	return shopDate;
}
public void setShopDate(Date shopDate) {
	this.shopDate = shopDate;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public boolean isMinor() {
	return minor;
}
public void setMinor(boolean minor) {
	this.minor = minor;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getPayAmount() {
	return payAmount;
}
public void setPayAmount(double payAmount) {
	this.payAmount = payAmount;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Sale(long id, String item, Date shopDate, String mobileNo, String customerName, String address, String state,
		Date dateOfBirth, boolean minor, int quantity, double price, double payAmount, String emailId) {
	super();
	this.id = id;
	this.item = item;
	this.shopDate = shopDate;
	this.mobileNo = mobileNo;
	this.customerName = customerName;
	this.address = address;
	this.state = state;
	this.dateOfBirth = dateOfBirth;
	this.minor = minor;
	this.quantity = quantity;
	this.price = price;
	this.payAmount = payAmount;
	this.emailId = emailId;
}
public Sale() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Sale [id=" + id + ", item=" + item + ", shopDate=" + shopDate + ", mobileNo=" + mobileNo + ", customerName="
			+ customerName + ", address=" + address + ", state=" + state + ", dateOfBirth=" + dateOfBirth + ", minor="
			+ minor + ", quantity=" + quantity + ", price=" + price + ", payAmount=" + payAmount + ", emailId="
			+ emailId + "]";
}




}
