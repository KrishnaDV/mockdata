package com.example.mock.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mock.FileReader.JsonReader;

@RestController
public class MockController {
	
	@Autowired
	JsonReader jr;

	
	@GetMapping(path = "/getEmployees", produces = "application/json")
	public String getEmpl() throws IOException {
		return jr.readDataFromFile();
	}
	
}
