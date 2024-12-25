package com.example.UsingThymleaf;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String homePage() {
		return "home.html";
	}

	@GetMapping("/otp")
	public String homer(ModelMap map) {
		map.put("otp", new Random().nextInt(1000, 10000));
		return "home.html";
	}

	@GetMapping("/color")
	public String color(@RequestParam("color") String color, @RequestParam("height") int height,
			@RequestParam("width") int width, ModelMap map) {
		map.put("color", color);
		map.put("width", width);
		map.put("height", height);
		return "home.html";
	}
}
