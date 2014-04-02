package com.hibernate.user;
// default package
// Generated Dec 20, 2013 2:48:31 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Ordercategorymaster generated by hbm2java
 */
public class Ordercategorymaster implements java.io.Serializable {

	private BigDecimal categoryid;
	private String categoryname;
	private Set<Ordercategorydetails> ordercategorydetailses = new HashSet<Ordercategorydetails>(0);

	public Ordercategorymaster() {
	}

	public Ordercategorymaster(BigDecimal categoryid) {
		this.categoryid = categoryid;
	}

	public Ordercategorymaster(BigDecimal categoryid, String categoryname,
			Set<Ordercategorydetails> ordercategorydetailses) {
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.ordercategorydetailses = ordercategorydetailses;
	}

	public BigDecimal getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(BigDecimal categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Set<Ordercategorydetails> getOrdercategorydetailses() {
		return this.ordercategorydetailses;
	}

	public void setOrdercategorydetailses(
			Set<Ordercategorydetails> ordercategorydetailses) {
		this.ordercategorydetailses = ordercategorydetailses;
	}

}