package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MarketEntity {
	@Id
	private  int id;
	private String name;
	private String school_name;
	private int fees;
	private String standard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public MarketEntity(int id, String name, String school_name, int fees, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.school_name = school_name;
		this.fees = fees;
		this.standard = standard;
	}
	public MarketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
