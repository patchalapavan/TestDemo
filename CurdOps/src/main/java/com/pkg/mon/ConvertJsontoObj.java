package com.pkg.mon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConvertJsontoObj {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\pavan\\Downloads\\barCodes.json");
			String jsonStr = "";
			String st;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while (( st = br.readLine()) != null) {
				jsonStr = jsonStr + st;
			}
			System.out.println(jsonStr);
			ObjectMapper mapper = new ObjectMapper();
			List<BarCodeReadResults> barCodesList = mapper.readValue(jsonStr, new TypeReference<List<BarCodeReadResults>>(){});
			System.out.println(barCodesList);
			br.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
