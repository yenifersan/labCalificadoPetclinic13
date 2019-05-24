package com.tecsup.petclinic.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.domain.Pet;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class OwnerServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceTest.class);

	@Autowired
	private OwnerService OwnerService;
	
	/**
	 * 
	 */
	@Test
	public void testFindPetByFirstName() {

		String OWNER_LAST_NAME = "Jean";
		int SIZE_EXPECTED = 1;

		List<Owner> owners = OwnerService.findByFirstName(OWNER_LAST_NAME);
		

		assertEquals(SIZE_EXPECTED, owners.size());
	}
	

	@Test
	public void testFindPetByLastName() {

		String OWNER_LAST_NAME = "Coleman";
		int SIZE_EXPECTED = 1;

		List<Owner> owners = OwnerService.findByLastName(OWNER_LAST_NAME);
	
		assertEquals(SIZE_EXPECTED, owners.size());
	}

	@Test
	public void testFindPetByCity() {

		String OWNER_LAST_NAME = "Monona";
		int SIZE_EXPECTED = 2;

		List<Owner> owners = OwnerService.findByCity(OWNER_LAST_NAME);
		

		assertEquals(SIZE_EXPECTED, owners.size());
	}
	
	
	@Test
	public void create() {

		String FIRSTNAME = "yenifer";
		String LASTNAME  = "santiago";
		String CITY    = "lima";
		Owner newowner = new Owner(FIRSTNAME,LASTNAME,CITY);
		Owner ownerCreate =OwnerService.create(newowner);

		try {
			
			ownerCreate = OwnerService.findById(ownerCreate.getId());
			logger.info("Owner whit id"+ ownerCreate.getId()+"create.");
		
			
		}catch(Exception e){
			logger.info("owner not found");
		}
		
		Iterable<Owner> owners = OwnerService.findAll();
		
		while (owners.iterator().hasNext()) {
			try  {
				 Owner ownerList = OwnerService.findById(ownerCreate.getId());
				 logger.info("Owner whit id"+ ownerList.getId()+"usuario  existente.");
				break;
				
			}catch (Exception e) {
				logger.info("usuario no existente ");
			}
			
		}
	}
	



}
