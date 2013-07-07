package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the party_clasification database table.
 * 
 */
@Embeddable
public class PartyClasificationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from_date")
	private java.util.Date fromDate;

	@Column(name="party_type_id")
	private Long partyTypeId;

	@Column(name="party_id")
	private Long partyId;

	public PartyClasificationPK() {
	}
	public java.util.Date getFromDate() {
		return this.fromDate;
	}
	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}
	public Long getPartyTypeId() {
		return this.partyTypeId;
	}
	public void setPartyTypeId(Long partyTypeId) {
		this.partyTypeId = partyTypeId;
	}
	public Long getPartyId() {
		return this.partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PartyClasificationPK)) {
			return false;
		}
		PartyClasificationPK castOther = (PartyClasificationPK)other;
		return 
			this.fromDate.equals(castOther.fromDate)
			&& (this.partyTypeId == castOther.partyTypeId)
			&& (this.partyId == castOther.partyId);
	}

	public int hashCode() {
		final Long prime = new Long(31);
		Long hash = new Long(17);
		hash = hash * prime + this.fromDate.hashCode();
		hash = hash * prime + this.partyTypeId;
		hash = hash * prime + this.partyId;
		
		return Integer.parseInt(hash.toString());
	}
}