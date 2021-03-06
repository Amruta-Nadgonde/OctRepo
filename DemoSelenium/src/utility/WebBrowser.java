package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {	
	public static WebDriver openBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDownloads\\chromedriver_94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}	
	public static void verifyTtile(WebDriver driver,String exptitle)
	{
		String acttitle = driver.getTitle();
		if(acttitle.equals(exptitle))
		{
			System.out.println("Title matched");
		}
		else
			System.out.println("Title not matched");		
	}

}
