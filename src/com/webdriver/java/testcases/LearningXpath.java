package com.webdriver.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("kkk");
		//Absolute x-path
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kkk@gmail.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[3]/a")).click();
		driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']")).click();
		
		String actTitle=driver.getTitle();
		String expTitle="Facebook";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		
		
	}
}