package com.Adactin_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configur_reader {
public static Properties p;

	public Configur_reader() throws IOException {
		File f = new File ("C:\\Users\\DELL\\eclipse-workspace\\Adactin_project\\src\\main\\1stFile.properties");
		FileInputStream fis =  new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
	}

	public String geturl() {
		String url =p.getProperty("url");
		return url;
		
	}
}
