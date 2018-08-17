package com.example.mock.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MockResponseService {

	Logger log = LoggerFactory.getLogger(MockResponseService.class);

	public ResponseEntity<String> getOk() {
		log.info("**************Retriveing data successful************");
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}

	public ResponseEntity<String> getCreated() {
		log.info("**************Retriveing data successful************");
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}

	public ResponseEntity<String> getBadRequest() {
		log.warn("**************Retriveing data successful************");
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}

	public ResponseEntity<String> getNotFound() {
		log.error("**************Retriveing data successful************");
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}

}
