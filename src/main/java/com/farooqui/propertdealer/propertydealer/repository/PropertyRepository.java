package com.farooqui.propertdealer.propertydealer.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.farooqui.propertdealer.propertydealer.model.Property;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class PropertyRepository {
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Property> getProperty() {
		return this.em.createQuery("SELECT property FROM Property property").getResultList();
	}

	public void addProperty(Property property) {
		if (property.getId() == null) {
			this.em.persist(property);
		} else {
			this.em.merge(property);
		}
	}

	public Property findPropertyById(int id) {
		Query query = this.em.createQuery("SELECT property FROM Property property WHERE pet.id =:id");
		query.setParameter("id", id);
		return (Property) query.getSingleResult();
	}

	public void deleteProperty(Property property) {
		String propertyId = property.getId().toString();
		this.em.createQuery("DELETE FROM Property property WHERE property.id=" + propertyId).executeUpdate();
		if (em.contains(property)) {
			em.remove(property);
		}
	}

}
