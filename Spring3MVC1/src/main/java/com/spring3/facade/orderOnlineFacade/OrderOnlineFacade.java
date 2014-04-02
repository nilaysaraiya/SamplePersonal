package com.spring3.facade.orderOnlineFacade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.hibernate.user.Ordercategorydetails;
import com.hibernate.user.Ordercategorymaster;
import com.spring3.vo.CategoryDetailsVO;
import com.spring3.vo.CategoryMasterVO;
import com.ejb.EJB3BeanRemote;

public class OrderOnlineFacade {

	private static final EJB3BeanRemote bean = connectBean();
	
	public OrderOnlineFacade() {

	}
	
	private static EJB3BeanRemote connectBean() {
		EJB3BeanRemote beanObj = null;
		try {
			beanObj = (EJB3BeanRemote) new InitialContext().lookup("java:global/SpringMVC/EJB3Bean!com.ejb.EJB3BeanRemote");
			
		} catch (NamingException ex) {
			System.err.println("EEEE:: " + ex.getMessage());
			//throw new NamingException();
		}
		return beanObj;
	}
	
	public List<CategoryMasterVO> getOrderCategoryMaster() {
		List<Ordercategorymaster> orderCatMstActualList;
		List<CategoryMasterVO> itemCategoryMasterList = new ArrayList<CategoryMasterVO>();
		CategoryMasterVO categoryMasterVO;
		
		Map<String, List<CategoryMasterVO>> itemCategoryMasterMap = new HashMap<String, List<CategoryMasterVO>>();
		try {
			//EJB3BeanRemote bean;
			orderCatMstActualList = bean.getOrderCategoryMaster();
			
			for (Ordercategorymaster orderCatMstList: orderCatMstActualList) {
				categoryMasterVO = new CategoryMasterVO();
				categoryMasterVO.setCategoryMasterNames(orderCatMstList.getCategoryname());
				itemCategoryMasterList.add(categoryMasterVO);
//				itemCategoryMasterList.add(orderCatMstList.getCategoryname());
			}
			
			//itemCategoryMasterMap.put("ITEMCATEGORYMASTER", itemCategoryMasterList);
			
		} catch (Throwable e) {
			System.out.println("Error getting Order Data:: " + e.getMessage());
		
		}
		
		return itemCategoryMasterList;
		
	}
	
	public int getOrderCategoryDetails() {
		List<Ordercategorydetails> orderCatDtlsList = new ArrayList<Ordercategorydetails>();
		List<CategoryDetailsVO> itemCategoryDetailsList = new ArrayList<CategoryDetailsVO>();
		CategoryDetailsVO categoryDetailsVO;
//		int orderCatDtlsList = 0;
		Map<String, List<CategoryMasterVO>> itemCategoryMasterMap = new HashMap<String, List<CategoryMasterVO>>();
		try {
			//EJB3BeanRemote bean;
			orderCatDtlsList = bean.getOrderCategoryDetails();
			
			
//			for (Ordercategorydetails orderCatDtlList: orderCatDtlsList) {
//				categoryDetailsVO = new CategoryDetailsVO();
//				categoryMasterVO.setCategoryMasterNames(orderCatDtlList.get.getCategoryname());
//				itemCategoryMasterList.add(categoryMasterVO);
////				itemCategoryMasterList.add(orderCatMstList.getCategoryname());
//			}
			
			//itemCategoryMasterMap.put("ITEMCATEGORYMASTER", itemCategoryMasterList);
			
		} catch (Throwable e) {
			System.out.println("Error getting Order Details Data:: " + e.getMessage());
		
		}
		
		return orderCatDtlsList.size();
		
	}

}
