package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the role_type database table.
 * 
 */
@Entity
@Table(name="role_type")
public class RoleType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	//bi-directional one-to-one association to PartyRoleType
	@OneToOne(mappedBy="roleType")
	private PartyRoleType partyRoleType;

	public RoleType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PartyRoleType getPartyRoleType() {
		return this.partyRoleType;
	}

	public void setPartyRoleType(PartyRoleType partyRoleType) {
		this.partyRoleType = partyRoleType;
	}

}