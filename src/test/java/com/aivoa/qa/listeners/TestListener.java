package com.aivoa.qa.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aivoa.qa.base.BaseTest;
import com.aivoa.qa.utils.ScreenshotUtil;

public class TestListener extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		String testName = result.getMethod().getMethodName();
		ScreenshotUtil.captureScreenshot(driver, testName);
	}

}
