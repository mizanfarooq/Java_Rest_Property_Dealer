package com.farooqui.propertdealer.propertydealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="construction_status")
public class ConstructionStatus {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String satus;
	public ConstructionStatus() {
		
	}
	public ConstructionStatus(int id, String satus) {
		super();
		this.id = id;
		this.satus = satus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	@Override
	public String toString() {
		return "ConstructionStatus [id=" + id + ", satus=" + satus + "]";
	}

}
