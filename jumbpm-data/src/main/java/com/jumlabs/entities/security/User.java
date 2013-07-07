package com.jumlabs.entities.security;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import javax.persistence.Entity;

import com.jumlabs.entities.peopleandorganizations.PartyRole;

@Entity
@Table(name="user")
@PrimaryKeyJoinColumn(name="party_role_id")
public class User extends PartyRole {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String userName;
	@Column
	private String password;
	@Column 
	private boolean enabled;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
