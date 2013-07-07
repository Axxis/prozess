package com.jumlabs.entities.peopleandorganizations;


import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the party_role_type database table.
 * 
 */
@Entity
@Table(name="party_role_type")
@PrimaryKeyJoinColumn(name="role_type_id")
public class PartyRoleType extends RoleType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PartyRoleType() {
	}
}