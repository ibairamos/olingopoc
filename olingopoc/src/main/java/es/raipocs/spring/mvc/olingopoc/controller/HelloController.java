package es.raipocs.spring.mvc.olingopoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("name", name);

		return "welcome";
	}
	
}
