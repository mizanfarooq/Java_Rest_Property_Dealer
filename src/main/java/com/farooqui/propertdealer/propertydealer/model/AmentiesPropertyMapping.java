package com.farooqui.propertdealer.propertydealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "amenties_property_mapping")
public class AmentiesPropertyMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "amenities_id")
	private Amenities amenities;

	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;

	public AmentiesPropertyMapping() {

	}

	public AmentiesPropertyMapping(Integer id, Amenities amenities, Property property) {
		super();
		this.id = id;
		this.amenities = amenities;
		this.property = property;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Amenities getAmenities() {
		return amenities;
	}

	public void setAmenities(Amenities amenities) {
		this.amenities = amenities;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "AmentiesPropertyMapping [id=" + id + ", amenities=" + amenities + ", property=" + property + "]";
	}

}
