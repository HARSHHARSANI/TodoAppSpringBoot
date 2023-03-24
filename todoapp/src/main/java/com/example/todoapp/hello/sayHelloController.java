package com.example.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sayHelloController {
	//"say-hello" => "Hello!,  what are you learning today?"
	
	
//	http://localhost:8080/say-hello
// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp		
// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp(){
		return "sayHello";
	}
}
