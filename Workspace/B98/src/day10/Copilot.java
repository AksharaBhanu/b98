package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copilot {

	public static void main(String[] args) {
		 // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Go to the Google homepage
        driver.get("https://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Close the browser
        driver.quit();
	}

}
