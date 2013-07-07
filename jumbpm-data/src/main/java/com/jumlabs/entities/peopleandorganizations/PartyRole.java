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

	@EmbeddedId
	private PartyRolePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from_date")
	private Date fromDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="thru_date")
	private Date thruDate;

	@OneToOne
	@JoinColumn(name="party_id",updatable=false,insertable=false)
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public PartyRole() {
	}

	public PartyRolePK getId() {
		return this.id;
	}

	public void setId(PartyRolePK id) {
		this.id = id;
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

}