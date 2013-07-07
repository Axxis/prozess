package com.jumlabs.entities.peopleandorganizations;


import javax.persistence.*;


/**
 * The persistent class for the organization database table.
 * 
 */
@Entity
@Table(name="organization")
@PrimaryKeyJoinColumn(name="party_id")
public class Organization extends Party {

	
	@Column(name="name")
	private  String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}