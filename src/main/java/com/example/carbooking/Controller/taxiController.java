package com.example.carbooking.Controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.carbooking.Dto.CustomerDetailsDto;
import com.example.carbooking.Dto.DriverDetailsDto;
import com.example.carbooking.Model.CustomerDetails;
import com.example.carbooking.Model.DriverDetails;
import com.example.carbooking.Repository.DriverDetailRepository;
import com.example.carbooking.ServiceImpl.DriverDetailsServiceImpl;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController

public class taxiController {
	
	@Autowired
	DriverDetailRepository driverDetailsRepository;
	
	@Autowired
	DriverDetailsServiceImpl driverDetailsServiceImpl;
	
	@RequestMapping(value = "/create/driver", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveInfo(@RequestBody DriverDetailsDto driverDetailsDto) throws Exception {
		DriverDetails driverDetails = new DriverDetails();
		BeanUtils.copyProperties(driverDetailsDto, driverDetails);
		driverDetailsServiceImpl.save(driverDetails);
		
	}
	
	
	
		@RequestMapping(value = "/get/drivers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<DriverDetails> getInfo() {
			return driverDetailsRepository.findstatus();
		}
	
	
		@RequestMapping(value = "/create/booking", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public void saveInfo(@RequestBody CustomerDetailsDto customerDetailsDto) throws Exception {
			CustomerDetails customerDetails = new CustomerDetails();
			BeanUtils.copyProperties(customerDetailsDto, customerDetails);
			driverDetailsServiceImpl.save(customerDetails);
			
		}
		
	
		
		@RequestMapping(value = "/get/drivers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<DriverDetails> getdriverInfo() {
			return driverDetailsRepository.findAll();
		}




	
	
	
	

}
