package com.aivoa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// locators for login page : email, password and submit button

	private By emailInput = By.id("email");
	private By passwordInput = By.id("password");
	private By loginButton = By.xpath("//button[contains(text(),'Login')]");

	public void openLoginPage() {
		driver.get("http://216.48.184.249:5289/login");
	}

	public void login(String email, String password) {
		driver.findElement(emailInput).sendKeys(email);
		driver.findElement(passwordInput).sendKeys(password);
		driver.findElement(loginButton).click();
	}
}
