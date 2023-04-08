package com.farooqui.propertdealer.propertydealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="owner_type")
public class OwnerType {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String owner_type;
	public OwnerType() {
		
	}
	public OwnerType(Integer id, String owner_type) {
		super();
		this.id = id;
		this.owner_type = owner_type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOwner_type() {
		return owner_type;
	}
	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}
	@Override
	public String toString() {
		return "OwnerType [id=" + id + ", owner_type=" + owner_type + "]";
	}

}

