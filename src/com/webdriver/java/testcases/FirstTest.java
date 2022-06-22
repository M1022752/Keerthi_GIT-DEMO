package com.webdriver.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver_win32/chromedriver.exe");	    
		
		WebDriver driver=new ChromeDriver();            //invoke the browser
	    
		
        /*System.setProperty("webdriver.firefox.marionette", "C:/Selenium/drivers/geckodriver-v0.30.0-win64/geckodriver.exe");	    
		WebDriver driver = new FirefoxDriver();            //invoke the browser */
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	        
	    driver.findElement(By.id("email")).sendKeys("keerthir.keerthi@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Be080168");
	    driver.findElement(By.name("login")).click();
	    
	    String expTitle="Facebook";
	    String actTitle=driver.getTitle();
	    
	    if (expTitle.equals(actTitle))
	    {
	    	System.out.println("Test passed");
	    }
	    else
	    {
	    	System.out.println("Test failed");
	    }
	    
	    driver.quit();
	   
	    
	    
	    }
}   