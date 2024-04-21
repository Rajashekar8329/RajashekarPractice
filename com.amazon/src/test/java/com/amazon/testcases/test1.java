package com.amazon.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
public static void main (String[] args ) {
	System.setProperty("webdriver.chromedriver","C:\\Users\\Admin\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//opened link
	driver.get("https://www.google.com/search?q=amazon&rlz=1C1OKWM_enIN863IN863&oq=am&gs_lcrp=EgZjaHJvbWUqDwgAECMYJxjjAhiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhIIARAuGCcYxwEY0QMYgAQYigUyBggCEEUYOTISCAMQABhDGIMBGLEDGIAEGIoFMgwIBBAAGEMYgAQYigUyCggFEAAYsQMYgAQyBggGEEUYPDIGCAcQRRg80gEIMjM3NmowajeoAgiwAgE&sourceid=chrome&ie=UTF-8");
    //clicked link
	driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a")).click();
    //getting current url
	/*System.out.println(driver.getCurrentUrl());
      System.out.println("everything ok");
     */
	WebElement send=driver.findElement(By.id("twotabsearchtextbox"));
	send.sendKeys("phone");
	driver.close();
}
}
