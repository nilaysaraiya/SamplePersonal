package com.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.hibernate.user.Ordercategorydetails;
import com.hibernate.user.Ordercategorymaster;

@Remote
public interface EJB3BeanRemote {
	public String getCategoryList();
	public List<Ordercategorymaster> getOrderCategoryMaster();
	public List<Ordercategorydetails> getOrderCategoryDetails();
}
