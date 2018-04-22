package com.company.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.dto.MemberVO;
import com.company.dto.ProductVO;
import com.company.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private ProductService productService;
	
	/**
	 *  home page 로 이동 (상품 목록 Page)
	 */
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) throws Exception{

		logger.info("HomePage");
		List<ProductVO> productList = productService.selectProduct();
		model.addAttribute("productList", productList);
		return "home";
	}
	
	/**
	 * 상품 세부사항 보기
	 */
	@RequestMapping(value="product_view")
	public String product_view(@RequestParam String id, Model model) throws Exception
	{
		logger.info("product_view: "+ id);
		
		model.addAttribute("product", productService.viewProduct(id));
		return "product";
	}

}