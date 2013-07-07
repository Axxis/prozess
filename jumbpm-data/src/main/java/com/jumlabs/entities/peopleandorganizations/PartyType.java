package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the party_type database table.
 * 
 */
@Entity
@Table(name="party_type")
public class PartyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String description;

	@OneToMany(mappedBy="partyType")
	private List<PartyClasification> partyClasifications;

	public List<PartyClasification> getPartyClasifications() {
		return partyClasifications;
	}

	public void setPartyClasifications(List<PartyClasification> partyClasifications) {
		this.partyClasifications = partyClasifications;
	}

	public PartyType() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}