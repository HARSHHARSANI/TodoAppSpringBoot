package com.example.todoapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class loginController {
	
	@Autowired
	private AuthenticationService authenticationService;
	public loginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginPage(){
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name , 
			@RequestParam String password , ModelMap model){
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			
			//authentication 
			//username : harsh
			//password : harsani
				
			return "welcome";
		}
		else {
			model.put("errorMessage", "InvalidCredentials !please try again");
			return "login";
		}
		
	
	}
	
}
