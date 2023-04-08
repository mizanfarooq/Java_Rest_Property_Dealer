package com.farooqui.propertdealer.propertydealer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farooqui.propertdealer.propertydealer.model.Amenities;
import com.farooqui.propertdealer.propertydealer.model.ConstructionStatus;
import com.farooqui.propertdealer.propertydealer.model.InitialData;
import com.farooqui.propertdealer.propertydealer.model.OwnerType;
import com.farooqui.propertdealer.propertydealer.model.PropertyType;
import com.farooqui.propertdealer.propertydealer.repository.HomeRepository;

@Service
public class HomeService {

	@Autowired
	private HomeRepository homeRepository;

	public InitialData DefaultData() {
		InitialData initialData = new InitialData();
		// TODO Auto-generated method stub
		try {
			List<PropertyType> prop = homeRepository.getPropertyType();
			List<Amenities> am = homeRepository.getAmenities();
			List<OwnerType> own = homeRepository.getOwnerType();
			List<ConstructionStatus> status = homeRepository.getConstructionStatus();
			initialData.setProperty_type(prop);
			initialData.setAment(am);
			initialData.setOwner_type(own);
			initialData.setCon_status(status);
		} catch (Exception e) {
			System.out.println("exception occured in  " + e);
		}
		return initialData;
	}

}
