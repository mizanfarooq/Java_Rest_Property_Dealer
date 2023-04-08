package com.farooqui.propertdealer.propertydealer.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farooqui.propertdealer.propertydealer.model.Property;
import com.farooqui.propertdealer.propertydealer.service.PropertyService;

@RestController
public class PropertyController {
	@Autowired
	private PropertyService propertyService;

	@RequestMapping(value = "property/{id}", method = RequestMethod.GET)
	public ResponseEntity<Property> findPropertyById(@PathVariable(name = "id") int id) {
		try {
			Property owner = propertyService.findPropertyById(id);
			return new ResponseEntity<Property>(owner, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Property>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "property/{id}", method = RequestMethod.GET)
	public List<Property> getProperty() {
		return propertyService.getProperty();
	}

	@RequestMapping(value = "property", method = RequestMethod.POST)
	public void addProperty(@RequestBody Property property) {
		propertyService.addProperty(property);
	}
	
	@RequestMapping(value="property/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Property> deleteProperty(@PathVariable int id){
		Property property = this.propertyService.findPropertyById(id);
        if (property == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.propertyService.deleteProperty(property);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
