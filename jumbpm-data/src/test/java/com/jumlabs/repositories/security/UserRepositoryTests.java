package com.jumlabs.repositories.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jumlabs.entities.peopleandorganizations.Organization;
import com.jumlabs.entities.peopleandorganizations.PartyClasification;
import com.jumlabs.entities.peopleandorganizations.PartyClasificationPK;
import com.jumlabs.entities.peopleandorganizations.PartyRole;
import com.jumlabs.entities.peopleandorganizations.PartyRolePK;
import com.jumlabs.entities.peopleandorganizations.PartyRoleType;
import com.jumlabs.entities.peopleandorganizations.PartyType;
import com.jumlabs.repositories.peopleandorganizations.OrganizationRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyClasificationRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyRoleRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyRoleTypeRepository;
import com.jumlabs.repositories.peopleandorganizations.PartyTypeRepository;

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

	@Test
	@Transactional
	public void testSave() throws Exception {
		// We save a new party
		PartyType partyType = new PartyType();
		partyType.setId(new Long(1));
		partyType.setDescription("USER");
		partyTypeRepository.save(partyType);

		Organization organization = new Organization();
		organization.setName("A new group");
		organizationRepository.save(organization);

		PartyClasification partyClasification = new PartyClasification();
		PartyClasificationPK ppPk = new PartyClasificationPK();
		ppPk.setFromDate(new Date());
		ppPk.setPartyId(organization.getId());
		ppPk.setPartyTypeId(partyType.getId());
		partyClasification.setId(ppPk);
		partyClasificationRepository.save(partyClasification);
		// Until here we have a new party

		PartyRoleType partyRoleType = new PartyRoleType();
		partyRoleType.setDescription("APPLICATION_GROUP");
		partyRoleType.setId(new Long(1));
		partyRoleTypeRepository.save(partyRoleType);

		PartyRolePK partyRolePK = new PartyRolePK();
		partyRolePK.setPartyId(organization.getId());
		partyRolePK.setPartyRoleTypeId(partyRoleType.getId());
		PartyRole partyRole = new PartyRole();
		partyRole.setId(partyRolePK);
		partyRole.setFromDate(new Date());
		partyRoleRepository.save(partyRole);
	}

}
