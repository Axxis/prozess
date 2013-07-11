package com.jumlabs.entities.peopleandorganizations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class PartyRelationshipPK {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from")
	private Date from;
	
	@Column(name="party_role_id_from")
	private Long partyRoleIdFrom;
	@Column(name="party_role_id_to")
	private Long partyRoleIdTo;
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Long getPartyRoleIdFrom() {
		return partyRoleIdFrom;
	}
	public void setPartyRoleIdFrom(Long partyRoleIdFrom) {
		this.partyRoleIdFrom = partyRoleIdFrom;
	}
	public Long getPartyRoleIdTo() {
		return partyRoleIdTo;
	}
	public void setPartyRoleIdTo(Long partyRoleIdTo) {
		this.partyRoleIdTo = partyRoleIdTo;
	}
}
