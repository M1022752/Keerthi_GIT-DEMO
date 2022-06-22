package com.webdriver.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/checkbox");
		
		WebElement checkbox=driver.findElement(By.xpath("//span[@class='rct-title']"));
		boolean isSelected=checkbox.isSelected();
		/*if (isSelected==false)
		{
			checkbox.click();
		}
		else 
		{
			System.out.println("dont do anything");
		}
		driver.quit();*/
		boolean displayed=checkbox.isDisplayed();
		if (displayed==true)
		{
			checkbox.click();
		}
		else
		{
			System.out.println("Did not find the checkbox");
		}
		Thread.sleep(3000);
		if (isSelected==true)
		{
			System.out.println("Checkbox is already selected");
		}
	}

}
