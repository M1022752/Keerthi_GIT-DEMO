package com.webdriver.java.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		/*Select select=new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		select.selectByIndex(3);
		select.selectByValue("6");
		select.selectByVisibleText("Voilet");
		
		Select se=new Select(driver.findElement(By.id("cars")));
		//Selecting multiple values from the dropdown
		if (se.isMultiple())
		{
			se.selectByIndex(1);
			se.selectByIndex(2);
			
			se.selectByValue("opel");
			se.selectByValue("audi");
			
			se.selectByVisibleText("Volvo");
			se.selectByVisibleText("Opel");
			
			
		}*/
		//For single select
		/*Select s=new Select(driver.findElement(By.id("oldSelectMenu")));
		List<WebElement> dropdownValues=s.getOptions();
	
		 for(WebElement options:dropdownValues )
	            System.out.println(options.getText());
		 
		 s.selectByVisibleText("Aqua");
		 System.out.println("The selected value is "+s.getFirstSelectedOption().getText());*/
		
		Select select=new Select(driver.findElement(By.id("cars")));
		List<WebElement>dropdownValues=select.getOptions();
		for (WebElement options:dropdownValues)
			System.out.println("The values are "+options.getText());
		
		if (select.isMultiple())
		{
			System.out.println("Select option Audi and Opel using Visible text");
			select.selectByVisibleText("Audi");
			select.selectByVisibleText("Opel");
			
			List<WebElement> values=select.getAllSelectedOptions();
			for (WebElement options:values)
				System.out.println("The selected values are "+options.getText());
		}
		
		select.deselectByVisibleText("Audi");
		//select.deselectByValue("opel");
		
		//Checking the values after deselection
		List<WebElement> selectedOptionsAfterDeselect=select.getAllSelectedOptions();
		for (WebElement options:selectedOptionsAfterDeselect)
			System.out.println(options.getText());
		driver.close();
	}
	


}
