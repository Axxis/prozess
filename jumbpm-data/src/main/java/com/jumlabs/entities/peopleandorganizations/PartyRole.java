package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the party_role database table.
 * 
 */
@Entity
@Table(name="party_role")
public class PartyRole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
    @Id
    private Long id;
    
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from_date")
	private Date fromDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="thru_date")
	private Date thruDate;

	//bi-directional many-to-one association to Party
	@ManyToOne
	private Party party;

	//bi-directional many-to-one association to PartyRoleType
	@ManyToOne
	@JoinColumn(name="party_role_type_id")
	private PartyRoleType partyRoleType;

	public PartyRole() {
	}	

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public PartyRoleType getPartyRoleType() {
		return this.partyRoleType;
	}

	public void setPartyRoleType(PartyRoleType partyRoleType) {
		this.partyRoleType = partyRoleType;
	}

}