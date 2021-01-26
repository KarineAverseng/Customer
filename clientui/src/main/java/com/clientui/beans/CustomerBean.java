package com.clientui.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CustomerBean extends JourneyBean {
	private Long customerId;
	private String customerName;
	private Date dateBecomeCustomer;
	private String email;
	private Integer phoneNumber;
	private Set<JourneyBean> journey = new HashSet<JourneyBean>();
	
	public CustomerBean() {
		super();
	}

	public CustomerBean(Long customerId, String customerName, Date dateBecomeCustomer, String email,
			Integer phoneNumber, Set<JourneyBean> journey) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.journey = journey;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDateBecomeCustomer() {
		return dateBecomeCustomer;
	}

	public void setDateBecomeCustomer(Date dateBecomeCustomer) {
		this.dateBecomeCustomer = dateBecomeCustomer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<JourneyBean> getJourney() {
		return journey;
	}

	public void setJourney(Set<JourneyBean> journey) {
		this.journey = journey;
	}



}
