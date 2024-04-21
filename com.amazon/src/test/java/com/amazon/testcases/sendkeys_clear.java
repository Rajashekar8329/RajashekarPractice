package com.amazon.testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class sendkeys_clear {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.ChromeDriver","C:\\Users\\Admin\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/search?q=amazon&rlz=1C1OKWM_enIN863IN863&oq=amazon&gs_lcrp=EgZjaHJvbWUqBwgAEAAYjwIyBwgAEAAYjwIyGwgBEC4YQxiDARjHARixAxjJAxjRAxiABBiKBTIGCAIQRRhAMg0IAxAAGIMBGLEDGIAEMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgxNTg3ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
	WebElement ama=driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div/a/div[2]/span[1]/span[2]/span[1]/div/span"));	
		ama.click();
		WebElement send=driver.findElement(By.id("twotabsearchtextbox"));
		send.sendKeys("phone");
		Thread.sleep(10000);
		//send.getSize();
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
	    search.click();
	  //  send.getText();
	   // driver.close();
	    driver.quit();
	}
}
