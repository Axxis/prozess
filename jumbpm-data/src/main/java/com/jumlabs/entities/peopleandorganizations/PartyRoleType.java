package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the party_role_type database table.
 * 
 */
@Entity
@Table(name="party_role_type")
public class PartyRoleType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="role_type_id")
	private int roleTypeId;

	//bi-directional many-to-one association to PartyRelationshipType
	@OneToMany(mappedBy="partyRoleType1")
	private List<PartyRelationshipType> partyRelationshipTypes1;

	//bi-directional many-to-one association to PartyRelationshipType
	@OneToMany(mappedBy="partyRoleType2")
	private List<PartyRelationshipType> partyRelationshipTypes2;

	//bi-directional many-to-one association to PartyRole
	@OneToMany(mappedBy="partyRoleType")
	private List<PartyRole> partyRoles;

	//bi-directional one-to-one association to RoleType
	@OneToOne
	@JoinColumn(name="role_type_id")
	private RoleType roleType;

	public PartyRoleType() {
	}

	public int getRoleTypeId() {
		return this.roleTypeId;
	}

	public void setRoleTypeId(int roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	public List<PartyRelationshipType> getPartyRelationshipTypes1() {
		return this.partyRelationshipTypes1;
	}

	public void setPartyRelationshipTypes1(List<PartyRelationshipType> partyRelationshipTypes1) {
		this.partyRelationshipTypes1 = partyRelationshipTypes1;
	}

	public PartyRelationshipType addPartyRelationshipTypes1(PartyRelationshipType partyRelationshipTypes1) {
		getPartyRelationshipTypes1().add(partyRelationshipTypes1);
		partyRelationshipTypes1.setPartyRoleType1(this);

		return partyRelationshipTypes1;
	}

	public PartyRelationshipType removePartyRelationshipTypes1(PartyRelationshipType partyRelationshipTypes1) {
		getPartyRelationshipTypes1().remove(partyRelationshipTypes1);
		partyRelationshipTypes1.setPartyRoleType1(null);

		return partyRelationshipTypes1;
	}

	public List<PartyRelationshipType> getPartyRelationshipTypes2() {
		return this.partyRelationshipTypes2;
	}

	public void setPartyRelationshipTypes2(List<PartyRelationshipType> partyRelationshipTypes2) {
		this.partyRelationshipTypes2 = partyRelationshipTypes2;
	}

	public PartyRelationshipType addPartyRelationshipTypes2(PartyRelationshipType partyRelationshipTypes2) {
		getPartyRelationshipTypes2().add(partyRelationshipTypes2);
		partyRelationshipTypes2.setPartyRoleType2(this);

		return partyRelationshipTypes2;
	}

	public PartyRelationshipType removePartyRelationshipTypes2(PartyRelationshipType partyRelationshipTypes2) {
		getPartyRelationshipTypes2().remove(partyRelationshipTypes2);
		partyRelationshipTypes2.setPartyRoleType2(null);

		return partyRelationshipTypes2;
	}

	public List<PartyRole> getPartyRoles() {
		return this.partyRoles;
	}

	public void setPartyRoles(List<PartyRole> partyRoles) {
		this.partyRoles = partyRoles;
	}

	public PartyRole addPartyRole(PartyRole partyRole) {
		getPartyRoles().add(partyRole);
		partyRole.setPartyRoleType(this);

		return partyRole;
	}

	public PartyRole removePartyRole(PartyRole partyRole) {
		getPartyRoles().remove(partyRole);
		partyRole.setPartyRoleType(null);

		return partyRole;
	}

	public RoleType getRoleType() {
		return this.roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

}