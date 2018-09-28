package com.vivaticket.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.Site")
public class UserRoleSite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userRoleSiteId;
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "ROLE_ID")
	private int roleId;
	@Column(name = "SITE_ID")
	private int siteId;

	public UserRoleSite(int userId, int roleId, int siteId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.siteId = siteId;
	}

	public int getUserRoleSiteId() {
		return userRoleSiteId;
	}

	public void setUserRoleSiteId(int userRoleSiteId) {
		this.userRoleSiteId = userRoleSiteId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

}
