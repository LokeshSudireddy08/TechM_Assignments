package com.app.runner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinusController {
	
	@GetMapping("/minus/num1/{n1}/num2/{n2}")
	public int minus(@PathVariable int n1,@PathVariable int n2)
	{
		System.out.println("calling add service num1 = " + n1 + " num2 = " + n2);
		return n1 - n2;
	}
}
