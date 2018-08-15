package com.example.mock.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

@Component
public class JsonReader {

	public static void main(String[] args) throws IOException {

		JsonReader jr = new JsonReader();

		String res = jr.readDataFromFile();

		System.out.println(res);
	}

	public String readDataFromFile() throws IOException {

		ClassLoader classLoader = getClass().getClassLoader();

		BufferedReader br = new BufferedReader(
				new InputStreamReader(classLoader.getResourceAsStream("static/Employees.json")));

		StringBuffer sb = new StringBuffer();

		String currentLine;

		while ((currentLine = br.readLine()) != null) {

			sb.append(currentLine);

		}

		return sb.toString();
	}

}
