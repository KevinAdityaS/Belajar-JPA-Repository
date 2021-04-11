package com.Batch8Ujian4.Main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
				
		return "index";
		
	}
	
}
