package com.farooqui.propertdealer.propertydealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "amenities")
public class Amenities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ament_type;

	public Amenities() {

	}

	public Amenities(Integer id, String ament_type) {
		super();
		this.id = id;
		this.ament_type = ament_type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAment_type() {
		return ament_type;
	}

	public void setAment_type(String ament_type) {
		this.ament_type = ament_type;
	}

	@Override
	public String toString() {
		return "Amenities [id=" + id + ", ament_type=" + ament_type + "]";
	}

}
