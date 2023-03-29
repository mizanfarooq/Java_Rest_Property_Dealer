package com.farooqui.propertdealer.propertydealer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "property")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PropertyType type ;
	
	private String price;
	private int age;
	private String floor;
	private String current_status;
	private String area;
	private String configuration;
	private String street;
	private String address1;
	private String adress2;
	private String city;
	private String state;
	private long zip;
	public Property() {
		
	}
	public Property(int id, Owner owner, PropertyType type, String price, int age, String floor, String current_status,
			String area, String configuration, String street, String address1, String adress2, String city,
			String state, long zip) {
		super();
		this.id = id;
		this.owner = owner;
		this.type = type;
		this.price = price;
		this.age = age;
		this.floor = floor;
		this.current_status = current_status;
		this.area = area;
		this.configuration = configuration;
		this.street = street;
		this.address1 = address1;
		this.adress2 = adress2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public PropertyType getType() {
		return type;
	}
	public void setType(PropertyType type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getCurrent_status() {
		return current_status;
	}
	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAdress2() {
		return adress2;
	}
	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", owner=" + owner + ", type=" + type + ", price=" + price + ", age=" + age
				+ ", floor=" + floor + ", current_status=" + current_status + ", area=" + area + ", configuration="
				+ configuration + ", street=" + street + ", address1=" + address1 + ", adress2=" + adress2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + "]";
	}

}
