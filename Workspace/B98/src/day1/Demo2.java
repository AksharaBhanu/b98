package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		//creating object of ChromeDriver class 
		ChromeDriver c=new ChromeDriver();//open the browser
		//calling non-static method
		c.get("http://www.google.com");//enter url and open the page
		//calling non-static method
		c.quit();//close the browser

	}

}
