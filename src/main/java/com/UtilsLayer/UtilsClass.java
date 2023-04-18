package com.UtilsLayer;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void enterDataInTextBox(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public static void clickOnButton(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}
	
	public static void click(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",wb);
	}

	public static String currentDateAndTime() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

	}

	public static void takeScreenShot() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dest = (System.getProperty("user.dir") + "\\Screenshot\\" + currentDateAndTime() + ".png");

		try {
			FileUtils.copyFile(src, new File(dest));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
