package com.jumlabs.repositories.security;

import static org.junit.Assert.assertEquals;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.jumlabs.entities.peopleandorganizations.PartyClasification;
import com.jumlabs.entities.peopleandorganizations.PartyClasificationPK;
import com.jumlabs.entities.peopleandorganizations.PartyRolePK;
import com.jumlabs.entities.peopleandorganizations.PartyRoleType;
import com.jumlabs.entities.peopleandorganizations.PartyType;
import com.jumlabs.entities.peopleandorganizations.Person;
import com.jumlabs.entities.security.User;
import com.jumlabs.repositories.peopleandorganizations.OrganizationRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyClasificationRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyRoleRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyRoleTypeRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyTypeRepository;
import com.jumlabs.repositories.peopleandorganizations.PersonRepository;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrganizationRepository organizationRepository;
	@Autowired
	private PartyClasificationRepository partyClasificationRepository;
	@Autowired
	PartyTypeRepository partyTypeRepository;

	@Autowired
	private PartyRoleRepository partyRoleRepository;
	@Autowired
	private PartyRoleTypeRepository partyRoleTypeRepository;
	@Autowired
	private PersonRepository personRepository;

	@Test
	@Transactional
	public void testSave() throws Exception {
		// We save a new party
		PartyType partyType = new PartyType();
		partyType.setId(new Long(1));
		partyType.setDescription("PERSON");
		partyTypeRepository.save(partyType);

		Person person=new Person();
		person.setFirstName("Otto");
		person.setLastName("Giron");
		personRepository.save(person);
		
		PartyClasification partyClasification = new PartyClasification();
		PartyClasificationPK ppPk = new PartyClasificationPK();
		ppPk.setFromDate(new Date());
		ppPk.setPartyId(person.getId());
		ppPk.setPartyTypeId(partyType.getId());
		partyClasification.setId(ppPk);
		partyClasificationRepository.save(partyClasification);
		// Until here we have a new party

		PartyRoleType partyRoleType = new PartyRoleType();
		partyRoleType.setDescription("APPLICATION_USER");
		partyRoleType.setId(new Long(1));
		partyRoleTypeRepository.save(partyRoleType);

		PartyRolePK partyRolePK = new PartyRolePK();
		partyRolePK.setPartyId(person.getId());
		partyRolePK.setPartyRoleTypeId(partyRoleType.getId());
		User user = new User();
		user.setId(partyRolePK);
		user.setFromDate(new Date());
		user.setUserName("otto.giron");
		user.setPassword("1234");
		user.setEnabled(true);
		userRepository.save(user);
		
		User savedUser=userRepository.findOne(user.getId());
		assertEquals("otto.giron",savedUser.getUserName());
		assertEquals(true,savedUser.isEnabled());				
	}

}
