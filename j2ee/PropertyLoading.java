package com.basic.j2ee;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoading {
	public static void main(String[] args) {
//Reading and writing operation
		try (FileReader fr = new FileReader("config/db.properties");
				FileWriter fwsys = new FileWriter("config/sys.properties");
				FileWriter fw = new FileWriter("config/geninfo.properties")) {
			Properties prop = new Properties();
			prop.load(fr);
			System.out.println("property loaded ");
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("jack", "NotFound"));
			System.out.println(prop.getProperty("dbname", "NotFound"));
			prop.setProperty("ownername", "qsp");
			prop.setProperty("contact", "123@gmail");
			prop.store(fw, "properties of app");

			Properties propsys = System.getProperties();
			propsys.store(fwsys, "properties of app");
			System.out.println("property loaded");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
