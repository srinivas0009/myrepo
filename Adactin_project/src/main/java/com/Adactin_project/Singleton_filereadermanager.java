package com.Adactin_project;

import java.io.IOException;

public class Singleton_filereadermanager {

	private Singleton_filereadermanager() {
		
	}

	//static
	public static Singleton_filereadermanager getFRM() {
		Singleton_filereadermanager helper = new Singleton_filereadermanager();
		return  helper;
	}
	
	//non static
	    public Configur_reader getCR() throws IOException{
	    	Configur_reader reader = new Configur_reader();
	    	return reader;
}
}