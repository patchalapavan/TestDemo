package com.pkg.mon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Mon {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\pavan\\Desktop\\input.txt");
		BufferedWriter output = null;
		try {
			long lineCount = Files.lines(path).count();
			System.out.println("lineCount : " + lineCount);
			File file = new File("C:\\Users\\pavan\\Desktop\\input.txt");
			File ofile = new File("C:\\Users\\pavan\\Desktop\\output.txt");
			output = new BufferedWriter(new FileWriter(ofile));
			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			int count =0;
			String queryInput = "";
			boolean flag = false;
			List<String> monList = new ArrayList<String>();
			while ((st = br.readLine()) != null) {
				String[] sList = st.split("\\|");
				if(sList[0] == null || sList[0].equals("") || sList[0].equals("   ")) {
					output.write(st + "N");
					output.write(System.getProperty("line.separator"));
					if(count == lineCount- 1) {
						flag = true;
						queryInput = queryInput.substring(0, queryInput.length() - 1);
					}
					lineCount--;
				} else {
					monList.add(st);
					if(lineCount>=1000 && count < 1000) {
						if(count == 999) {
							queryInput += "'"+sList[0].trim()+"'";
							lineCount = lineCount - 1000;
							count = 0;
							flag = true; 
						} else {
							queryInput += "'"+sList[0].trim()+"',";
							
							flag = false;
						}
						count++;
					} else {
						if(count == lineCount-1) {
							queryInput += "'"+sList[0].trim()+"'";
							flag = true;
						}
						else {
							queryInput += "'"+sList[0].trim()+"',";
							flag = false;
						}
						count++;
					}
				}
				if(flag) {
					for(int i=0; i<monList.size();i++ ) {
						output.write(monList.get(i) + "Y");
						output.write(System.getProperty("line.separator"));
					}
					System.out.println(queryInput);
					String query = "select * from table where mon in ("+queryInput+")";
					System.out.println(query);
				}
				
			}
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
