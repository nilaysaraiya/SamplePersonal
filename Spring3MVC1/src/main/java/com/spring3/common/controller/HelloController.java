package com.spring3.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring3.facade.orderOnlineFacade.OrderOnlineFacade;
import com.spring3.vo.CategoryMasterVO;


@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
//	public String printWelcome1(ModelMap model) {
//
//		model.addAttribute("message", "Spring 3 MVC Hello World");
//		model.addAttribute("success", "Login successful");
//		
//		return "Hello";
//
//	}
	
	public ModelAndView printWelcome() {
		ModelAndView model = new ModelAndView("Hello");
		OrderOnlineFacade orderOnlineFacade = new OrderOnlineFacade();
		try {
			List<CategoryMasterVO> itemCategoryMasterList = orderOnlineFacade.getOrderCategoryMaster();
//			List<CategoryDetailsVO> itemCategoryDetailsList = orderOnlineFacade.getOrderCategoryDetails();
			int orderSize = orderOnlineFacade.getOrderCategoryDetails();
			
			// Prepare model
			model.addObject("message", "Spring 3 MVC Hello World!");
			model.addObject("success", itemCategoryMasterList);
			model.addObject("size", orderSize);
			
		} catch (Exception e) {
			System.out.println("EEEEE:::: " + e.getMessage());
		}
		return model;

	}
	
}
