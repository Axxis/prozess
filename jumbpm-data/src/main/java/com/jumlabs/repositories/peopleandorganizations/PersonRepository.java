package com.jumlabs.repositories.peopleandorganizations;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumlabs.entities.peopleandorganizations.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
