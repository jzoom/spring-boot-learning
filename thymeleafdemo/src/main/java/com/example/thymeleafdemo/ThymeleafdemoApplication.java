package com.example.thymeleafdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
@SpringBootApplication
public class ThymeleafdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}


	@Autowired
	private ProductService productService;

	@RequestMapping
	public String index(Model model){
		model.addAttribute("welcome","Hello world!");
		model.addAttribute("products",productService.findAll());
		return "index";
	}

}
