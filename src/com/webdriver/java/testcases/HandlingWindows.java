package com.webdriver.java.testcases;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows =driver.getWindowHandles();
		Iterator<String> iterator=allWindows.iterator();
		
		while (iterator.hasNext())
		{
			String childWindow=iterator.next();
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
			driver.switchTo().window(childWindow);
			WebElement text=driver.findElement(By.id("sampleHeading"));
			System.out.println("Heading of the child window is "+ text.getText());
			}
				
		}
		
		driver.switchTo().window(mainWindow);
		
		

	}
	

}
      