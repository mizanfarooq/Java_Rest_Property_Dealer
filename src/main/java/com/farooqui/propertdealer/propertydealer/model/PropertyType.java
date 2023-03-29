package com.farooqui.propertdealer.propertydealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="property_type")
public class PropertyType {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String p_type;
	public PropertyType() {
		
	}
	public PropertyType(int id, String p_type) {
		super();
		this.id = id;
		this.p_type = p_type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	@Override
	public String toString() {
		return "PropertyType [id=" + id + ", p_type=" + p_type + "]";
	}
	
	

}
