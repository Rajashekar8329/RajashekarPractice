package com.amazon.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_refresh_newlink_back_forward {
	
	public static void main (String[] args )
	{
	System.setProperty("webdriver.chromedriver","C:\\Users\\Admin\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/search?q=amazon&rlz=1C1OKWM_enIN863IN863&oq=am&gs_lcrp=EgZjaHJvbWUqDwgAECMYJxjjAhiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhIIARAuGCcYxwEY0QMYgAQYigUyBggCEEUYOTISCAMQABhDGIMBGLEDGIAEGIoFMgwIBBAAGEMYgAQYigUyCggFEAAYsQMYgAQyBggGEEUYPDIGCAcQRRg80gEIMjM3NmowajeoAgiwAgE&sourceid=chrome&ie=UTF-8");	
	//clicking
	driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a")).click();
    //refreshing
	driver.navigate().refresh();
	//back
	driver.navigate().back();
	//forward
	driver.navigate().forward();

	
		
	}

}
