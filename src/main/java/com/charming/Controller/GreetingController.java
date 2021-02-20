package com.charming.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charming.domain.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/connectionorder")
	public ConnectionOrder co(@RequestParam(value = "sysnamea", defaultValue = "default") String sysnamea) {
		ConnectionOrder con = new ConnectionOrder();
		con.setSysnamea("aaaa");
		con.setSitea("aaaa");
		con.setPtpnamea("aaaa");
		con.setSysnamez("zzzz");
		con.setSitez("zzzz");
		con.setPtpnamez("zzzz");
		
		return con;
	}
}