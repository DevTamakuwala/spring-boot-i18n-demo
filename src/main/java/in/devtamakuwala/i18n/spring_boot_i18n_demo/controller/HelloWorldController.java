package in.devtamakuwala.i18n.spring_boot_i18n_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.devtamakuwala.smarti18nauto.annotation.AutoTranslate;

@RestController
@AutoTranslate
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		System.out.println("API called");
		return "Hello..!! How are you ?";
	}
	
	@GetMapping("/hello/{text}")
	public String helloWorldUserText(@PathVariable String text) {
		return text;
	}

}
