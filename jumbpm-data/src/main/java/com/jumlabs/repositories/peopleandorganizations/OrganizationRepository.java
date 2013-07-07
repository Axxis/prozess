package com.jumlabs.repositories.peopleandorganizations;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumlabs.entities.peopleandorganizations.Organization;

public interface OrganizationRepository extends
		JpaRepository<Organization, Long> {

}
