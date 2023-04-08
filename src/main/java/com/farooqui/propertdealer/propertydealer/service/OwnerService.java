package com.farooqui.propertdealer.propertydealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farooqui.propertdealer.propertydealer.model.Owner;
import com.farooqui.propertdealer.propertydealer.repository.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository;

	public Owner findOwnerById(int id) {
		// TODO Auto-generated method stub
		return ownerRepository.findOwnerById(id);
	}

	public void addOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerRepository.addOwner(owner);
	}

	public void deleteOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerRepository.deleteOwner(owner);
	}

	public List<Owner> getOwner() {
		// TODO Auto-generated method stub
		return ownerRepository.getOwner();
	}


}
