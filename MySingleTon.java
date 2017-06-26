package com.practice.singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import jdk.jfr.events.FileWriteEvent;

public class MySingleTon {
	private static MySingleTon  instance;// = new MySingleTon();
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private MySingleTon(){
		
	}

	public static MySingleTon getIstance(){
		if (instance == null)
			instance = new MySingleTon();
		return instance;
	}
	
	public void display(String str) throws IOException{
		FileWriter wr = new FileWriter(new File("C:\\Users\\Sunil\\Desktop\\sangu.log.txt"));
		wr.write(str);
		wr.flush();
		wr.close();
	
	}
	
}
