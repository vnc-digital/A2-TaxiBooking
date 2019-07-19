package com.example.carbooking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.carbooking.Model.DriverSchedule;

@Repository
public interface DriverScheduleRepositoty extends CrudRepository<DriverSchedule, Integer>{

}
