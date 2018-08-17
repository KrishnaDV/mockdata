package com.example.mock.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class JsonReader {
	
	public String readDataFromFile() throws IOException {

		StringBuilder sb = new StringBuilder();
		
		Stream<String> stream  =  Files.lines(Paths.get(("src/main/resources/static/Employees.json")));
		
		stream.forEach(line -> sb.append(line));

		return sb.toString();
	}

}
