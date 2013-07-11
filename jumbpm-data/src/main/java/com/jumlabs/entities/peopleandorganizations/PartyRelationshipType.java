package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the party_relationship_type database table.
 * 
 */
@Entity
@Table(name="party_relationship_type")
public class PartyRelationshipType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PartyRelationshipTypePK id;

	private String description;

	private String name;

	public PartyRelationshipType() {
	}

	public PartyRelationshipTypePK getId() {
		return this.id;
	}

	public void setId(PartyRelationshipTypePK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}