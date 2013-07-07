package com.jumlabs.entities.peopleandorganizations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the role_type database table.
 * 
 */
@Entity
@Table(name="role_type")
@Inheritance(strategy=InheritanceType.JOINED)
public class RoleType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String description;



	public RoleType() {
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