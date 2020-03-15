package KeywordDriven_Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	
	public static void openBrowser(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver(); //constants pass bcoz in that class instances var of webdriver initialized
			break;
			
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			
		case "HTMLUnit":
			Constants.driver = new HtmlUnitDriver();

		default:
			System.out.println("Invalid Browser name"+browsername);
			break;
		}
		
	}
	
	/*
	 * It open specified url in webBrowser recently open by driver instance
	 */
	public static void openURL(String url) {
		Constants.driver.get(url);
	}

}
