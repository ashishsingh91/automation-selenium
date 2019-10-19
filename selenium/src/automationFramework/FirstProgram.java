package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram {
       static
       {
    	   System.setProperty("webdriver.chrome.driver","E:/Testing/driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care?agentId=20004977");
	    driver.findElement(By.id("policynumber")).sendKeys("123456");
		Thread.sleep(1000);
//		WebElement a = driver.findElement(By.className(" ui-state-default"));
//		Select obj=new Select(a);
//		obj.selectByVisibleText("10");
//		WebElement b = driver.findElement(By.className("ui-datepicker-month"));
//		Select obj1=new Select(b);
//		obj.selectByVisibleText("Jun");
//		WebElement c = driver.findElement(By.className("ui-datepicker-year"));
//		Select obj2=new Select(c);
//		obj.selectByVisibleText("1997");
	
		//driver.findElement(By.id("alternative_number")).sendKeys("9993087728");
	
		//driver.findElement(By.id("renew_policy_submit")).click();
		//driver.close();
		
		 


	}

}
