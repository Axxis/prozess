package com.jumlabs.repositories.peopleandorganizations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jumlabs.entities.peopleandorganizations.Organization;
import com.jumlabs.entities.peopleandorganizations.PartyClasification;
import com.jumlabs.entities.peopleandorganizations.PartyClasificationPK;
import com.jumlabs.entities.peopleandorganizations.PartyRoleType;
import com.jumlabs.entities.peopleandorganizations.PartyType;

//import com.jumlabs.jumbpm.data.Item;
//import com.jumlabs.jumbpm.data.Order;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class PartyRoleTypeRepositoryTests {

//	@PersistenceContext
//	private EntityManager entityManager;
//
	
	@Autowired
	private PartyRoleTypeRepository partyRoleTypeRepository;
	
	@Test
	@Transactional
	public void testSave() throws Exception {
		PartyRoleType partyRoleType=new PartyRoleType();
		partyRoleType.setDescription("APPLICATION_USER");
		partyRoleType.setId(new Long(1));
		partyRoleTypeRepository.save(partyRoleType);
	}

}
