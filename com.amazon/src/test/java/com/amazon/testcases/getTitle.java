package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	public static void main (String[] args ) {
		
	System.setProperty("webDriver ChromeDriver","C:\\Users\\Admin\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/search?q=amazon&rlz=1C1OKWM_enIN863IN863&oq=am&gs_lcrp=EgZjaHJvbWUqDwgAECMYJxjjAhiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhIIARAuGCcYxwEY0QMYgAQYigUyBggCEEUYOTISCAMQABhDGIMBGLEDGIAEGIoFMgwIBBAAGEMYgAQYigUyCggFEAAYsQMYgAQyBggGEEUYPDIGCAcQRRg80gEIMjM3NmowajeoAgiwAgE&sourceid=chrome&ie=UTF-8");
	String pagecode= driver.getTitle();
	System.out.println(pagecode);
	}
	

}
