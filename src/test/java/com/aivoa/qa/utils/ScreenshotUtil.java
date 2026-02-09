package com.aivoa.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String captureScreenshot(WebDriver driver, String testName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = "screenshots/" + testName + ".png";
		File finalDestination = new File(destination);

		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());

			e.printStackTrace();
		}
		return destination;
	}
}
