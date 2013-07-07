package com.jumlabs.repositories.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumlabs.entities.peopleandorganizations.PartyRolePK;
import com.jumlabs.entities.security.Group;

public interface GroupRepository extends JpaRepository<Group,PartyRolePK> {

}
