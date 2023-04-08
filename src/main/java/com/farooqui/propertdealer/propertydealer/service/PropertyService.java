package com.farooqui.propertdealer.propertydealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farooqui.propertdealer.propertydealer.model.Property;
import com.farooqui.propertdealer.propertydealer.repository.PropertyRepository;

@Service
public class PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	public List<Property> getProperty() {

		return propertyRepository.getProperty();
	}

	public void addProperty(Property property) {
		propertyRepository.addProperty(property);

	}

	public Property findPropertyById(int id) {
		return propertyRepository.findPropertyById(id);
	}

	public void deleteProperty(Property property) {
		propertyRepository.deleteProperty(property);
		
	}

}
