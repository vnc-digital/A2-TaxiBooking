package com.example.carbooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.carbooking.Model.DriverDetails;

@Repository
public interface DriverDetailRepository extends CrudRepository<DriverDetails, Long>{

	

	@Query(value="select * from driverdetails where status='No'",nativeQuery=true)
	List<DriverDetails> findstatus();

	
	
	List<DriverDetails> findAll();
}
