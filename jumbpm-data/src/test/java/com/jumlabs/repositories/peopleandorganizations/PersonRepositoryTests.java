package com.jumlabs.repositories.peopleandorganizations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jumlabs.entities.peopleandorganizations.Organization;

//import com.jumlabs.jumbpm.data.Item;
//import com.jumlabs.jumbpm.data.Order;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonRepositoryTests {

//	@PersistenceContext
//	private EntityManager entityManager;
//
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Test
	@Transactional
	public void testSaveOrderWithItems() throws Exception {
		Organization organization=new Organization();
	    organization.setName("A Fine organization");
	    organizationRepository.save(organization);
		List<Organization> organizations=organizationRepository.findAll();
		assertEquals(organizations.size(),1);
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
