package com.jumlabs.entities.peopleandorganizations;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;



/**
 * The persistent class for the party database table.
 * 
 */
@Entity
@Table(name="party")
@Inheritance(strategy=InheritanceType.JOINED)
public class Party {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	
	public Long getId(){
		return this.id;		
	}
	
	@OneToMany(mappedBy="party")	
	private List<PartyClasification> partyClasifications=new ArrayList<PartyClasification>();



	public List<PartyClasification> getPartyClasifications() {
		return partyClasifications;
	}

	public void setPartyClasifications(List<PartyClasification> partyClasifications) {
		this.partyClasifications = partyClasifications;
	}	

}