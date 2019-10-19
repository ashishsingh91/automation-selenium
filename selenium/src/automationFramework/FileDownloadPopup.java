package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {
	   static
	   {
	   System.setProperty("webdriver.gecko.driver","E:/Testing/driver/geckodriver.exe");
	}
        public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
		
			
		}

}
