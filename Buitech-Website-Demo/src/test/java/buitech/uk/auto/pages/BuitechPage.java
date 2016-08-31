package buitech.uk.auto.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://buitech.co.uk/")
public class BuitechPage extends PageObject {
		@FindBy(xpath = "*[@href='/testing-services'")
	WebElement homePage;

	@FindBy(xpath = "//a[@href='/testing-solutions'")
	WebElement testingServices;

	@FindBy(xpath = "//a[@href='/testing-solutions'")
	WebElement testingSolutions;

	@FindBy(xpath = "//a[@href='/resources'")
	WebElement resources;

	@FindBy(xpath = "//a[@href='/clients'")
	WebElement clients;

	
	public void click_link(String xpath) {
		testingServices.click();
		testingSolutions.click();
		resources.click();
		clients.click();
		homePage.click();
		
	}

/*	public void scroll_emlemt_down(int x) {
		evaluateJavascript("window.scrollTo(" + x + ");");
		
	}*/

}
