package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the party_relationship_type database table.
 * 
 */
@Embeddable
public class PartyRelationshipTypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Long id;

	@Column(name="party_role_type_id_from")
	private Long partyRoleTypeIdFrom;

	@Column(name="party_role_type_id_to")
	private Long partyRoleTypeIdTo;

	public PartyRelationshipTypePK() {
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPartyRoleTypeIdFrom() {
		return this.partyRoleTypeIdFrom;
	}
	public void setPartyRoleTypeIdFrom(Long partyRoleTypeIdFrom) {
		this.partyRoleTypeIdFrom = partyRoleTypeIdFrom;
	}
	public Long getPartyRoleTypeIdTo() {
		return this.partyRoleTypeIdTo;
	}
	public void setPartyRoleTypeIdTo(Long partyRoleTypeIdTo) {
		this.partyRoleTypeIdTo = partyRoleTypeIdTo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PartyRelationshipTypePK)) {
			return false;
		}
		PartyRelationshipTypePK castOther = (PartyRelationshipTypePK)other;
		return 
			(this.id == castOther.id)
			&& (this.partyRoleTypeIdFrom == castOther.partyRoleTypeIdFrom)
			&& (this.partyRoleTypeIdTo == castOther.partyRoleTypeIdTo);
	}

	public int hashCode() {
		final Long prime =new Long( 31);
		Long hash = new Long(17);
		hash = hash * prime + this.id;
		hash = hash * prime + this.partyRoleTypeIdFrom;
		hash = hash * prime + this.partyRoleTypeIdTo;		
		return Integer.parseInt(hash.toString());
	}
}