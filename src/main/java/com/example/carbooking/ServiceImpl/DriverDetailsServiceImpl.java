package com.example.carbooking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carbooking.Model.CustomerDetails;
import com.example.carbooking.Model.DriverDetails;
import com.example.carbooking.Repository.DriverDetailRepository;
import com.example.carbooking.Service.DriverDetailsService;


@Service
public class DriverDetailsServiceImpl  implements DriverDetailsService{
	
	@Autowired
	DriverDetailRepository driverDetailRepository;

	public void save(DriverDetails driverDetails) {
	
		
		driverDetails.setDriverName(driverDetails.getDriverName());
		driverDetails.setMobileNo(driverDetails.getMobileNo());
		driverDetails.setStatus("NO");
		
		driverDetailRepository.save(driverDetails);
	}

	public void save(CustomerDetails customerDetails) {
		
	}

	
}
