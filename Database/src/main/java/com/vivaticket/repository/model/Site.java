package com.vivaticket.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dbo.Site")
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int siteId;
	@Column(name="SITE_NAME")
	private String siteName;
	public Site(String siteName) {
		super();
		this.siteName = siteName;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	
	
	
	
	
}

