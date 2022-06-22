package com.webdriver.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadiobuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/radio-button");
		
		WebElement radioButton1=driver.findElement(By.xpath("//label[text()='Yes']"));
		boolean status1=radioButton1.isDisplayed();
		if(status1==true)
		{
			radioButton1.click();
		}
		
		
		WebElement radioButton2=driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
		boolean status2=radioButton2.isDisplayed();
		if (status2==true)
		{
			radioButton2.click();
		}
		boolean sta=radioButton2.isEnabled();
		if (sta==true)
		{
		System.out.println("Selected Impressive");
		}
		else 
		{
			System.out.println("Wrong selection");
		}
		
		WebElement radioButton3=driver.findElement(By.xpath("//label[text()='No']"));
		boolean status3=radioButton3.isSelected();
		if (status3==false)
		{
			System.out.println("Radio button disabled");
		}
		else
		{
			System.out.println("Enable the radio button");
		}
		
		driver.quit();
		
		
	}

}
