package Autocomplete;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class PushNotification_Popup
	{
		public static void main(String[] args)  {

			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.redbus.in");
		}
	}

