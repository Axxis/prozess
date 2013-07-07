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
import com.jumlabs.entities.peopleandorganizations.PartyType;

//import com.jumlabs.jumbpm.data.Item;
//import com.jumlabs.jumbpm.data.Order;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class OrganizationRepositoryTests {

//	@PersistenceContext
//	private EntityManager entityManager;
//
	
	@Autowired
	private OrganizationRepository organizationRepository;
	@Autowired
	private PartyClasificationRepository partyClasificationRepository;
	@Autowired
	PartyTypeRepository partyTypeRepository;
	
	@Test
	@Transactional
	public void testSaveOrderWithItems() throws Exception {
		PartyType partyType=new PartyType();
		partyType.setId(new Long(1));
		partyType.setDescription("ORGANIZATION");
		partyTypeRepository.save(partyType);
		
		
		PartyClasification partyClasification=new PartyClasification();				
	    Organization organization=new Organization();	    
		organization.setName("A Fine organization");	
		organizationRepository.save(organization);
		
		PartyClasificationPK ppPk=new  PartyClasificationPK();
		ppPk.setFromDate(new Date());
		ppPk.setPartyId(organization.getId());		
		ppPk.setPartyTypeId(partyType.getId());
		partyClasification.setId(ppPk);
		partyClasificationRepository.save(partyClasification);		
		assertEquals(1,organizationRepository.findAll().get(0).getPartyClasifications().size());
		assertEquals(1, partyTypeRepository.findAll().size());
//		assertEquals(1,Integer.parseInt(partyClasificationRepository.findAll().get(0).getParty().getId().toString()));
	}
//
//	@Test
//	@Transactional
//	public void testSaveAndGet() throws Exception {
//		Order order = new Order();
//		order.getItems().add(new Item());
//		entityManager.persist(order);
//		entityManager.flush();
//		// Otherwise the query returns the existing order (and we didn't set the
//		// parent in the item)...
//		entityManager.clear();
//		Order other = (Order) entityManager.find(Order.class, order.getId());
//		assertEquals(1, other.getItems().size());
//		assertEquals(other, other.getItems().iterator().next().getOrder());
//	}
//
//	@Test
//	@Transactional
//	public void testSaveAndFind() throws Exception {
//		Order order = new Order();
//		Item item = new Item();
//		item.setProduct("foo");
//		order.getItems().add(item);
//		entityManager.persist(order);
//		entityManager.flush();
//		// Otherwise the query returns the existing order (and we didn't set the
//		// parent in the item)...
//		entityManager.clear();
//		Order other = (Order) entityManager
//				.createQuery(
//						"select o from Order o join o.items i where i.product=:product")
//				.setParameter("product", "foo").getSingleResult();
//		assertEquals(1, other.getItems().size());
//		assertEquals(other, other.getItems().iterator().next().getOrder());
//	}

}
