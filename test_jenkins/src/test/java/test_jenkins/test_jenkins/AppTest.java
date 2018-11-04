package test_jenkins.test_jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class AppTest 
{
    
    @Test
    public void test() throws InterruptedException
    {
		System.setProperty("webdriver.gecko.driver","geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		String appUrl = "http://google.com";
	    driver.get(appUrl);
	    
	    driver.findElement(By.name("q")).sendKeys("Download Selenium");
	    //Thread.sleep(3000L);
	    driver.findElement(By.name("btnK")).click();
	    
	    driver.close();


    }
}
