package com.amazon.testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class isDIs_isSel_isEn {
	public static void main (String[] args) {
	System.setProperty("webDriver.ChromeDriver","C:\\Users\\Admin\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
    //open link
	//driver.get("https://www.google.com/search?q=mvnrepository&rlz=1C1OKWM_enIN863IN863&oq=&gs_lcrp=EgZjaHJvbWUqCQgEECMYJxjqAjISCAAQIxgnGOoCGIsDGKYDGKgDMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQ05MTY3Njg3MjlqMWo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
	//WebElement dis=driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div/div/div/div/div/div/div/div/span/a/div/div/div/div/span"));	
	//System.out.println(dis.isDisplayed());
    //is enabled
    //driver.get("https://www.google.com/search?q=mvnrepository&rlz=1C1OKWM_enIN863IN863&oq=&gs_lcrp=EgZjaHJvbWUqCQgEECMYJxjqAjISCAAQIxgnGOoCGIsDGKYDGKgDMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQ05MTY3Njg3MjlqMWo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
	//WebElement dis=driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div/div/div/div/div/div/div/div/span/a/div/div/div/div/span"));	
	//System.out.println(dis.isEnabled());
	//is selected
    /*driver .get("https://www.w3schools.com/jquerymobile/tryit.asp?filename=tryjqmob_forms_checked");
    WebElement male=driver.findElement(By.name("#male"));
    		male.click();
    System.out.println(male.isSelected());
    */
    driver .get("https://www.w3schools.com/jquerymobile/tryit.asp?filename=tryjqmob_forms_checked");
    WebElement male=driver.findElement(By.name("//*[@id=\"green\"]/parent::*"));
    		male.click();
    System.out.println(male.isSelected());
    driver.close();
	}
	
}
