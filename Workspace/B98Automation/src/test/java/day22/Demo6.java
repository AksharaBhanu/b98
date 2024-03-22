package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		p.load(new FileInputStream("./data/data.properties"));
		String u = p.getProperty("un");
		System.out.println(u);
		
		u = p.getProperty("Un");
		System.out.println(u);
		
		u = p.getProperty("city");
		System.out.println(u);
		
		u = p.getProperty("url");
		System.out.println(u);
		
		u = p.getProperty("time");
		int i = Integer.parseInt(u);
		System.out.println(i);
		
		
		u = p.getProperty("pw");
		System.out.println(u);
		
	}

}
