package com.BaseLayer;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static void initialization() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.intelligencebank.com/contact-us/");
		driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']/span/div/div[2]/a[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://go.intelligencebank.com/l/941293/2021-08-09/2gdc87p']")));
		

	}
}
