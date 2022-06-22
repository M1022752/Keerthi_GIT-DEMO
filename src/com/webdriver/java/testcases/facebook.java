package com.webdriver.java.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Avani");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.name("reg_email__")).sendKeys("12345");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Be080168");
		
		Select dropdown1=new Select(driver.findElement(By.id("day")));
		dropdown1.selectByValue("22");
		Thread.sleep(3000);
		Select dropdown2=new Select(driver.findElement(By.id("month")));
		dropdown2.selectByValue("May");
		Thread.sleep(3000);
		Select dropdown3=new Select(driver.findElement(By.id("year")));
		dropdown3.selectByValue("2021");
		
	
	}

}
  