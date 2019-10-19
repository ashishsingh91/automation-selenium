package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class Filpkart {
	public static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		
		initWebDriver("https://www.flipkart.com");
		
		
		  Actions actions = new Actions(driver);
		  Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
		  
		  sendEsc.perform();
		  driver.findElement(By.name("q")).sendKeys("Realme C2 Mobile");
		  driver.findElement(By.className("vh79eN")).click();
		  
		  Action sendPageDown = actions.sendKeys(Keys.PAGE_DOWN).build();
		  sendPageDown.perform();
		  //Thread.sleep(50000);
		  String xpathNoRows="//*[@class='_1HmYoV hCUpcT']/div";
		List<WebElement> listTotal=driver.findElements(By.xpath(xpathNoRows));
		System.out.println("Total number of rows : " +listTotal.size());
		Thread.sleep(50000);
		driver.quit();
	
	}

	
	public static void initWebDriver(String URL) throws InterruptedException {

		// Setting up Chrome driver path.
		System.setProperty("webdriver.chrome.driver","E:/Testing/driver/chromedriver.exe");
		// Launching Chrome browser.
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	

}
