package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.WebBrowser;

public class LocateLinks {

	public static void main(String[] args) {		
		WebDriver driver = WebBrowser.openBrowser("https://www.google.co.in/");			
		driver.findElement(By.linkText("Gmail")).click();
		WebBrowser.verifyTtile(driver, "Gmail - Email from Google");
		driver.navigate().back();
		driver.findElement(By.linkText("Images")).click();
		WebBrowser.verifyTtile(driver, "Google Images");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Advert")).click();
		WebBrowser.verifyTtile(driver, "Get More Customers With Easy Online Advertising | Google Ads");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("How Search")).click();
		driver.navigate().back();
		

	}

}
