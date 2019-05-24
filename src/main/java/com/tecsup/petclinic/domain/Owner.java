package com.tecsup.petclinic.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * 
 * @author yenifer
 *
 */
@Entity(name = "owners")
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String address;
	private String city;
	private String telephone;

	public Owner() {
	}
	

	public Owner(String firstName, String lastName, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

//	public Owner(String firstName, String lastName, String address, String city,String telephone) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.address = address;
//		this.city = city;
//		this.telephone = telephone;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return firstName;
	}

	public void setFirst_name(String firstName) {
		this.firstName = firstName;
	}

	public String getLast_name() {
		return lastName;
	}

	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", first_name=" + firstName + ", last_name=" + lastName + ", address=" + address
				+ ", city=" + city + ", telephone=" + telephone + "]";
	}
	
	
}
