package com.pralay.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pralay.entity.Contact;


public interface StateRepository extends JpaRepository<State, Serializable> {
	
	
	public List<State> findByCountryId(Integer countryId);
	
}
