package automationFramework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePopup {
 static
    {
 	   System.setProperty("webdriver.chrome.driver","E:/Testing/driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		
		
		 WebElement uploadElement = driver.findElement(By.id("input_resumeParser"));
		 Thread.sleep(1000);
		 uploadElement.sendKeys("C:\\Users\\Ashish Singh\\Downloads\\Resume.docx");
		String e = driver.getWindowHandle();
		System.out.println(e);
		Set<String> f = driver.getWindowHandles();
        for(String g:f)
        {
        	if(e.equals(g)) {
        		continue;
        }
        	driver.switchTo().window(g);
        	driver.close();
        	}
       
        
        
        }
	}

