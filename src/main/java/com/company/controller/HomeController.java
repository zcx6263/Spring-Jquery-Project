package com.company.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 처음 home page 로 이동
	 */
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) throws Exception{

		logger.info("defaultPage");

		return "home";
	}
	/**
	 * Home 에서 의사유저 버튼 클릭시 페이지 이동
	 */
	@RequestMapping(value = "docPageButton",  method = RequestMethod.GET)
	public String docPageButton() throws Exception{

		logger.info("docPage Button clicked");
		return "login";
	}
	/**
	 * Home 에서 일반사용자 버튼 클릭시 페이지 이동
	 */
	@RequestMapping(value = "generalUserButton",  method = RequestMethod.GET)
	public String generalUserButton() throws Exception{

		logger.info("generalSurvey Button clicked");
		return "generalSurvey";
	}






	
}