package com.farooqui.propertdealer.propertydealer.model;

import java.util.List;


public class InitialData {	
	private List<Amenities> ament;
	private List<ConstructionStatus> con_status;
	private List<OwnerType> owner_type;
	private List<PropertyType> property_type;
	
	public List<Amenities> getAment() {
		return ament;
	}
	public void setAment(List<Amenities> ament) {
		this.ament = ament;
	}
	public List<ConstructionStatus> getCon_status() {
		return con_status;
	}
	public void setCon_status(List<ConstructionStatus> con_status) {
		this.con_status = con_status;
	}
	public List<OwnerType> getOwner_type() {
		return owner_type;
	}
	public void setOwner_type(List<OwnerType> owner_type) {
		this.owner_type = owner_type;
	}
	public List<PropertyType> getProperty_type() {
		return property_type;
	}
	public void setProperty_type(List<PropertyType> property_type) {
		this.property_type = property_type;
	}

	
	

}
