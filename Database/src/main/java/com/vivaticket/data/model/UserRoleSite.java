package com.vivaticket.data.model;

public class UserRoleSite {

	private int userRoleSiteId;

	private int userId;
	private int roleId;
	private int siteId;

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
