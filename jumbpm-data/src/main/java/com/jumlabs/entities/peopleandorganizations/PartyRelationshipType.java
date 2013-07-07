package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the party_relationship_type database table.
 * 
 */
@Entity
@Table(name="party_relationship_type")
public class PartyRelationshipType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	private Long id;
	
	private String description;

	private String name;

	//bi-directional many-to-one association to PartyRoleType
	@ManyToOne
	@JoinColumn(name="party_role_type_id_from")
	private PartyRoleType partyRoleType1;

	//bi-directional many-to-one association to PartyRoleType
	@ManyToOne
	@JoinColumn(name="party_role_type_id_to")
	private PartyRoleType partyRoleType2;

	public PartyRelationshipType() {
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PartyRoleType getPartyRoleType1() {
		return this.partyRoleType1;
	}

	public void setPartyRoleType1(PartyRoleType partyRoleType1) {
		this.partyRoleType1 = partyRoleType1;
	}

	public PartyRoleType getPartyRoleType2() {
		return this.partyRoleType2;
	}

	public void setPartyRoleType2(PartyRoleType partyRoleType2) {
		this.partyRoleType2 = partyRoleType2;
	}

}