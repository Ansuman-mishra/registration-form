package com.pralay.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Serializable>{
	List<city> findByStateId(Integer stateId);
}
