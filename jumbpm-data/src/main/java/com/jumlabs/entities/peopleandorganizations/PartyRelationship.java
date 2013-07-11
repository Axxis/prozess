package com.jumlabs.entities.peopleandorganizations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="party_relationship")
@Inheritance(strategy=InheritanceType.JOINED)
public class PartyRelationship {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="thru")
	private Date thru;
	
	@Column(name="comment")
	private String comment;

	public Date getThru() {
		return thru;
	}

	public void setThru(Date thru) {
		this.thru = thru;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
