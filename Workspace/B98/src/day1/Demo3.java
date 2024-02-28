package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) {
		// Open Firefox
		FirefoxDriver f=new FirefoxDriver();
		//enter fb.com
		f.get("http://www.fb.com");
		//close the browser
		f.quit();
	}

}
