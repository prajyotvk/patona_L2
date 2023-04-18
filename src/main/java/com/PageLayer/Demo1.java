package com.PageLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 extends BaseClass{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.intelligencebank.com/contact-us/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		WebElement wb=driver.findElement(By.xpath("//label[text()='First Name*']/following::input[6]"));
		wb.sendKeys("ppkpkp");
		UtilsClass.takeScreenShot();
		
		WebElement dd=driver.findElement(By.xpath("//label[text()='First Name*']/following::input[6]"));
		dd.click();
		
	}

}
