package com.rest.webservices.restfulwebservices.helloworld;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class ExchangeController {

	@GetMapping(path = "/convert/{curreny}/{ammount}")
	public Integer helloWorldBean(@PathVariable("curreny") String cur, @PathVariable("ammount") String amt) throws JsonParseException, JsonMappingException, IOException {

		final String uri = "http://localhost:5000/convert/"+cur;
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		
		JsonObject convertedObject = new Gson().fromJson(result, JsonObject.class);
		int unit=convertedObject.get("unitValue").getAsInt();
		
		
		return unit * Integer.parseInt(amt);
	}

}
