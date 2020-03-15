package Autocomplete;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RedBus {
	
	public WebDriver driver;
	WebDriverWait wait;
	
//	private  By inputText = By.cssSelector("input#src.db");
	@BeforeClass
	public void Setup() {
	 ChromeOptions option =new ChromeOptions();
	 option.addArguments("--disable-notifications"); //notification popup disable
	 
	 driver = new ChromeDriver(option);
	 driver.manage().window().maximize();
	 wait = new WebDriverWait(driver, 5);
	 
	}
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get("http://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pun");
		Thread.sleep(4000);
		selectOptionWithText("Swargate, Pune");
			
	//	selectOptionWithData_Number(2);
	}
	
	public void selectOptionWithText(String textToEnter) throws InterruptedException {
		try{
			WebElement autoOptions = driver.findElement(By.className("autoFill"));
			Thread.sleep(4000);
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for (WebElement  WebOptions : optionsToSelect)
			{
				if(WebOptions.getText().equals(textToEnter))
				{
					System.out.println(""+textToEnter);
					WebOptions.click();
					break;
				}
			}
		} 	catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
			}
			catch (Exception e) {
			System.out.println(e.getStackTrace());
			}
	
	}//method end

/*	public void selectOptionWithData_Number(int dataNumberToSelect) {
		try{
			WebElement autoOptions = driver.findElement(By.className("autoFill"));
			Thread.sleep(4000);
			
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));

			//			if(dataNumberToSelect<=optionsToSelect.size())
//			{
//				optionsToSelect.get(dataNumberToSelect).click();
//			}
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
			}
			catch (Exception e) {
			System.out.println(e.getStackTrace());
			} 
	} */

}
