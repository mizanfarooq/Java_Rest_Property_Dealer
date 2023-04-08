package com.farooqui.propertdealer.propertydealer.repository;

import java.util.List;

import com.farooqui.propertdealer.propertydealer.model.Owner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class OwnerRepository {

	@PersistenceContext
	private EntityManager em;

	public Owner findOwnerById(int id) {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery("SELECT owner FROM Owner owner WHERE owner.id =:id");
		query.setParameter("id", id);
		return (Owner) query.getSingleResult();
	}

	public void addOwner(Owner owner) {
		// TODO Auto-generated method stub
		if (owner.getId() == null) {
			this.em.persist(owner);
		} else {
			this.em.merge(owner);
		}
	}

	public void deleteOwner(Owner owner) {
		// TODO Auto-generated method stub
		String ownerId = owner.getId().toString();
		this.em.createQuery("DELETE FROM Owner owner WHERE owner.id=" + ownerId).executeUpdate();
		if (em.contains(owner)) {
			em.remove(owner);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Owner> getOwner() {
		return this.em.createQuery("SELECT owner FROM Owner owner").getResultList();
	}

}
