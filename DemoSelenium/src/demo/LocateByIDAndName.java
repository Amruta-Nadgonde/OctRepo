package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateByIDAndName {
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");		
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("admin12");		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin@1");		
		driver.findElement(By.name("proceed")).click();
		
		String acterror = driver.findElement(By.cssSelector("div#div_login_error>b")).getText();
//		if(acterror.equals("Wrong username and password combination."))
//		{
//			System.out.println("Pass");
//		}
//
//		else
//			System.out.println("Fail");
		
		String experror = "Wrong username and password combination.";
		if(acterror.equals(experror))
		{
			System.out.println("Pass");
		}
	}

}
