package com.example.mock.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mock.FileReader.JsonReader;
import com.example.mock.service.MockCpuService;
import com.example.mock.service.MockResponseService;
import com.example.mock.util.CpuUsage;

@RestController
public class MockController {

	@Autowired
	JsonReader jr;

	@Autowired
	MockCpuService mcs;

	@Autowired
	MockResponseService mrs;

	@GetMapping(path = "/getEmployees", produces = "application/json")
	public String getEmpl() throws IOException {
		return jr.readDataFromFile();
	}

	@GetMapping("/get/200")
	public ResponseEntity<String> sendOk() {
		return mrs.getOk();
	}

	@GetMapping("/get/201")
	public ResponseEntity<String> sendCreated() {
		return mrs.getCreated();
	}

	@GetMapping("/get/400")
	public ResponseEntity<String> sendBadRequest() {
		return mrs.getBadRequest();
	}

	@GetMapping("/get/404")
	public ResponseEntity<String> sendNotFound() {
		return mrs.getNotFound();
	}

	@GetMapping(path = "/getCpuMetrics", produces = "application/json")
	public CpuUsage scheduleTaskWithFixedRate() {
		return mcs.getMetrics();
	}
}
