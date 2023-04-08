package com.farooqui.propertdealer.propertydealer.repository;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.farooqui.propertdealer.propertydealer.model.Amenities;
import com.farooqui.propertdealer.propertydealer.model.ConstructionStatus;
import com.farooqui.propertdealer.propertydealer.model.OwnerType;
import com.farooqui.propertdealer.propertydealer.model.PropertyType;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class HomeRepository {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")

	public List<PropertyType> getPropertyType() {
		return this.em.createQuery("SELECT propertytype FROM PropertyType propertytype").getResultList();

	}

	@SuppressWarnings("unchecked")

	public List<Amenities> getAmenities() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT amenities FROM Amenities amenities").getResultList();
	}

	@SuppressWarnings("unchecked")

	public List<OwnerType> getOwnerType() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT owner FROM OwnerType owner").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<ConstructionStatus> getConstructionStatus() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT construction FROM ConstructionStatus construction").getResultList();
	}

}
