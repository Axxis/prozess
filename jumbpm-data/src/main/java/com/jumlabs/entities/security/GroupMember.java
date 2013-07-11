package com.jumlabs.entities.security;

import java.io.Serializable;
import javax.persistence.*;

import com.jumlabs.entities.peopleandorganizations.PartyRelationship;


/**
 * The persistent class for the group_member database table.
 * 
 */
@Entity
@Table(name="group_member")
@PrimaryKeyJoinColumns({
			@PrimaryKeyJoinColumn(name="from"),
			@PrimaryKeyJoinColumn(name="party_role_id_from"),
			@PrimaryKeyJoinColumn(name="party_role_id_to")
		})
public class GroupMember extends PartyRelationship{
	
}