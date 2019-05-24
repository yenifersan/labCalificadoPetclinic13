package com.tecsup.petclinic.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author yenifer
 *
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
	
	// Fetch owners by firstName
	List<Owner> findByFirstName(String firstName);

	// Fetch owners by lastName
	List<Owner> findByLastName(String lastName);

	// Fetch owners by city
	List<Owner> findByCity(String city);

}
