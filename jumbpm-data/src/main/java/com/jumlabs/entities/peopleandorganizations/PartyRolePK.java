package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the party_role database table.
 * 
 */
@Embeddable
public class PartyRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Long id;

	@Column(name="party_id")
	private Long partyId;

	@Column(name="party_role_type_id")
	private Long partyRoleTypeId;

	public PartyRolePK() {
	}
	public Long getId() {
		return this.id;
	}

	public Long getPartyId() {
		return this.partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	public Long getPartyRoleTypeId() {
		return this.partyRoleTypeId;
	}
	public void setPartyRoleTypeId(Long partyRoleTypeId) {
		this.partyRoleTypeId = partyRoleTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PartyRolePK)) {
			return false;
		}
		PartyRolePK castOther = (PartyRolePK)other;
		return 
			(this.id == castOther.id)
			&& (this.partyId == castOther.partyId)
			&& (this.partyRoleTypeId == castOther.partyRoleTypeId);
	}

	public int hashCode() {
		final Long prime = new Long(31);
		Long hash = new Long(17);
		hash = hash * prime + this.id;
		hash = hash * prime + this.partyId;
		hash = hash * prime + this.partyRoleTypeId;
		
		return Integer.parseInt(hash.toString());
	}
}