package com.airMytrip.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getHomePage() {
		return "homePage";
		
	}
}

//what does the controller do
	// whenever i hit the home button the controller should return a home page
//	that means m requesting a to the server to return the page in that case we asre going to use RequestMapping annotation 
//	that means m mapping a request to the function
//the request mapping should also be the given the path at which it works 


//why it return a string we will not return a entire file beacuse we have already added prefix and suffix 
	// just by returning simple string like home spring will automatically added the
	// prefix and suffix and
//	Look for the exact file and send it back we dont need to explicitly mention it 