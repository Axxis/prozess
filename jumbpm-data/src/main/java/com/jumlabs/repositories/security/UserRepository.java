package com.jumlabs.repositories.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumlabs.entities.peopleandorganizations.PartyRolePK;
import com.jumlabs.entities.security.User;

public interface UserRepository extends JpaRepository<User,PartyRolePK> {

}
