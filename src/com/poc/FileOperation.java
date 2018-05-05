package com.poc;

import java.io.*;
import java.util.HashMap;

public class FileOperation {

	public FileOperation() {
		
	}
	
	public void read() {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		File file = new File("/home/synerzip/eclipse-workspace/OopsDemo/src/com/poc/sample.txt");
		try {
		
		FileReader fis = new FileReader(file);
		BufferedReader br = new BufferedReader(fis);
		String  line= br.readLine();
		
		while(line != null) {
			System.out.println();
			String arr[] = line.split(":");
			int key = Integer.parseInt(arr[0]);
			hm.put(key, arr[1]);
			line = br.readLine();
			System.out.println(hm);
		}
		fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void write() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		File file = new File("/home/synerzip/eclipse-workspace/OopsDemo/src/com/poc/sample.txt");
		FileWriter fileWriter = null;
		BufferedWriter bufferWritter = null;
		try {
			fileWriter=new FileWriter(file);
			bufferWritter =new BufferedWriter(fileWriter);
			bufferWritter.write("This is an example \n");
			bufferWritter.write("of using BufferedWriter and \n");
			bufferWritter.write("BufferedReader.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fileWriter!=null){
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bufferWritter!=null){
				try {
					bufferWritter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
