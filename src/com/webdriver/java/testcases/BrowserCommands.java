package com.webdriver.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows/");
		//To get the page title name and title length
		String pageTitle=driver.getTitle();
		//To get the title length
		int titleLength=driver.getTitle().length();
		
		System.out.println("Page title is "+pageTitle);
		
		System.out.println("Title length is "+titleLength);
		
		String currentURL=driver.getCurrentUrl();
		//System.out.println(currentURL);
		String actURL="https://demoqa.com/browser-windows/";
		if (actURL.equals(currentURL))
		{
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		
		String pageSource=driver.getPageSource();
		int pageSourceLength=driver.getPageSource().length();
		System.out.println("Page source length is "+pageSourceLength);
		
		//driver.close();
		//driver.findElement(By.id("windowButton")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
	
	}

}
