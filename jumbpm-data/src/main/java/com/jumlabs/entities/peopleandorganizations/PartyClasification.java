package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the party_clasification database table.
 * 
 */
@Entity
@Table(name="party_clasification")
public class PartyClasification implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PartyClasificationPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="thru_date")
	private Date thruDate;
	

	
	@ManyToOne
	@JoinColumn(name="party_id",updatable=false,insertable=false)
	private Party party;
	
	@ManyToOne
	@JoinColumn(name="party_type_id",updatable=false,insertable=false)
	private PartyType partyType;

	public PartyType getPartyType() {
		return partyType;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public PartyClasification() {
	}

	public PartyClasificationPK getId() {
		return this.id;
	}

	public void setId(PartyClasificationPK id) {
		this.id = id;
	}

	public Date getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

}