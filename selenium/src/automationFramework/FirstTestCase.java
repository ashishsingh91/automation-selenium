package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//WebDriver driver = new ChromeDriver();
		//webdriver.chrome.driver=E:/Testing/driver/chromedriver.exe
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("singhpooja1006@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9074809493");
		 System.out.println("Successfully opened the website facebook");
		 driver.findElement(By.xpath("//input[@value='Log In']")).click();
        
       

 //Wait for 5 Sec
        	Thread.sleep(1000);

//        // Close the driver
       driver.quit();
	}

}
