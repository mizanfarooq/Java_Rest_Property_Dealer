package com.farooqui.propertdealer.propertydealer.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farooqui.propertdealer.propertydealer.model.InitialData;
import com.farooqui.propertdealer.propertydealer.model.Owner;
import com.farooqui.propertdealer.propertydealer.model.Property;
import com.farooqui.propertdealer.propertydealer.service.HomeService;
import com.farooqui.propertdealer.propertydealer.service.OwnerService;
// [...]
import com.farooqui.propertdealer.propertydealer.service.PropertyService;

@RestController
public class OwnerController {
	@Autowired
	private HomeService homeService;

	Logger logger = LogManager.getLogger(OwnerController.class);

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public InitialData HomePage() {
		// log message
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		return homeService.DefaultData();
	}

	
	
	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "owner", method = RequestMethod.GET)
	public List<Owner> getProperty() {
		return ownerService.getOwner();
	}

	@RequestMapping(value = "owner/{id}", method = RequestMethod.GET)
	public ResponseEntity<Owner> findPropertyById(@PathVariable(name = "id") int id) {
		try {
			Owner owner = ownerService.findOwnerById(id);
			return new ResponseEntity<Owner>(owner, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Owner>(HttpStatus.NOT_FOUND);
		}
	}


	@RequestMapping(value = "owner", method = RequestMethod.POST)
	public void addProperty(@RequestBody Owner owner) {
		ownerService.addOwner(owner);
	}
	
	@RequestMapping(value="owner/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Owner> deleteOwner(@PathVariable int id){
		Owner owner = this.ownerService.findOwnerById(id);
        if (owner == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.ownerService.deleteOwner(owner);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
