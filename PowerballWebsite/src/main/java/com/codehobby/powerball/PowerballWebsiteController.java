package com.codehobby.powerball;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PowerballWebsiteController
{
	@RequestMapping("/")
	public String root( Model model )
	{
		return "root";
	}
}
