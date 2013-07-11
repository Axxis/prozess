package com.jumlabs.entities.security;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import javax.persistence.Entity;

import com.jumlabs.entities.peopleandorganizations.PartyRole;

@Entity
@Table(name="group")
@PrimaryKeyJoinColumn(name="party_role_id")
public class Group extends PartyRole {


		
}
