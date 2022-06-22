package com.webdriver.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EffectiveXpaths {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		//driver.findElement(By.xpath("//input[contains(@id, 'firstN')]")).sendKeys("kkk");
		//driver.findElement(By.xpath("//input[@placeholder='Last Name' and @type='text']")).sendKeys("R");
		//driver.findElement(By.cssSelector("input[placeholder^='Last']")).sendKeys("Rev"); attribute starts with use this symbol "^"
		driver.findElement(By.cssSelector("input[id$='astName']")).sendKeys("Revanasiddappa"); //for ends with use "$"
		driver.findElement(By.cssSelector("input[placeholder*='r']")).sendKeys("Keerthi"); //contains "*"
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'name@')]")).sendKeys("kkk@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		//driver.findElement(By.xpath("//textarea[@id='currentAddress' or @class='form-control']")).sendKeys("Home address");
		driver.findElement(By.cssSelector("textarea.form-control[id='currentAddress']")).sendKeys("My Home");
		//driver.findElement(By.cssSelector("input[id='userNumber']")).sendKeys("1234"); By using id
		//driver.findElement(By.cssSelector("input#userNumber")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[placeholder='Mobile Number']")).sendKeys("7889");
	
	}

	
}
