package com.jumlabs.repositories.peopleandorganizations;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumlabs.entities.peopleandorganizations.PartyType;

public interface PartyTypeRepository extends JpaRepository<PartyType,Long> {

}
