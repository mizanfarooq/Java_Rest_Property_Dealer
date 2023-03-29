package com.farooqui.propertdealer.propertydealer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farooqui.propertdealer.propertydealer.model.Amenities;
import com.farooqui.propertdealer.propertydealer.model.InitialData;
import com.farooqui.propertdealer.propertydealer.service.HomeService;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
// [...]

@RestController
public class OwnerController {
	@Autowired
	private HomeService homeService;
	
	Logger logger = LogManager.getLogger(OwnerController.class);
	@RequestMapping(value="home", method = RequestMethod.GET)
	public InitialData HomePage(){
		// log message
		 logger.info("An INFO Message");
		 logger.warn("A WARN Message");
		 logger.error("An ERROR Message");
		return homeService.DefaultData();
	}
	
	
}
