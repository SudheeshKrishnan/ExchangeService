package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@GetMapping(path = "/convert/{curreny}")
	public LimitRate helloWorldBean(@PathVariable("curreny") String cur) {
		LimitRate lr = null;
		switch (cur) {
		case "dollar":
			lr = new LimitRate(cur,  70);
			break;
		case "euro":
			lr = new LimitRate(cur, 80);
			break;
		default:
			lr = new LimitRate("", 0);
		}
		return lr;
	}

}
