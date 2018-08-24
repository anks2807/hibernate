package com.model;

import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name = "age")
	private long age;
	
	@ElementCollection
	@JoinTable(name="user_address", joinColumns=@JoinColumn(name="user_id"))
	private Collection<Address> address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

	
	
	
}
