package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
	 static
	    {
	 	   System.setProperty("webdriver.chrome.driver","E:/Testing/driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("(//button[2])")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
