package com.example.carbooking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.carbooking.Model.Car;

@Repository
public interface CustomerDetailsRepository extends CrudRepository<Car, Integer>{

}
