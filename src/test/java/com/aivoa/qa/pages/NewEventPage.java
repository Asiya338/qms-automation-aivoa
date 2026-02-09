package com.aivoa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewEventPage {

	private WebDriver driver;

	public NewEventPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openNewEventPage() {
		driver.get("http://216.48.184.249:5289/quality/records/new?template_id=c5915aaf-6b3a-48b2-8b2a-190e8d1904c8");
	}

	// locators
	private By shortDescription = By.name("shortDescription");
	private By criticalityDropdown = By.name("preliminaryCriticality");
	private By saveDraftButton = By.xpath("//button[contains(text(),'Save Draft')]");
	private By productImpactCheckbox = By.xpath("//input[@type='checkbox']");
	private By validationMessage = By.className("error-message");

	public void enterShortDescription(String text) {
		driver.findElement(shortDescription).sendKeys(text);
	}

	public void selectCriticality(String value) {
		driver.findElement(criticalityDropdown).sendKeys(value);
	}

	public void clickSaveDraft() {
		driver.findElement(saveDraftButton).click();
	}

	public void selectProductImpact() {
		driver.findElement(productImpactCheckbox).click();
	}

	public boolean isValidationDisplayed() {
		return driver.findElement(validationMessage).isDisplayed();
	}

}
