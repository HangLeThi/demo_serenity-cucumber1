package buitech.uk.auto.webdriver.action;

	import java.util.NoSuchElementException;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class WebDriverAction {
		public Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
		static WebDriver driver = null;

		public WebDriverAction(WebDriver driver) {
			System.setProperty("org.apache.commons.logging.Log",
					"org.apache.commons.logging.impl.Jdk14Logger");
			WebDriverAction.driver = driver;
		}

		private By getBy(String locator) {
			By by = null;
			if (locator.startsWith("id=")) {
				locator = locator.substring(3);
				by = By.id(locator);
			} else if (locator.startsWith("name=")) {
				locator = locator.substring(4);
				by = By.name(locator);
			} else if (locator.startsWith("css=")) {
				locator = locator.substring(4);
				by = By.cssSelector(locator);
			} else if (locator.startsWith("link=")) {
				locator = locator.substring(5);
				by = By.linkText(locator);
			} else if (locator.startsWith("xpath=")) {
				locator = locator.substring(6);
				by = By.linkText(locator);
			} else {
				System.out
						.println(("[>>>ERROR<<<] Executing: |This xpath format does not support||"));
			}
			return by;
		}

		public WebElement getWebElement(String locator) {
			return driver.findElement(getBy(locator));
		}

		public void click(String locator) {
			APP_LOGS.debug("[info] Executing: |open |");
			WebElement element = getWebElement(locator);
			element.click();
		}

		public void sendKeys(String locator, String value) {
			try {
				APP_LOGS.debug("[info] Executing: |sendKeys |" + locator + "|"
						+ value + "|");
				WebElement element = getWebElement(locator);
				element.sendKeys(value);
			} catch (NoSuchElementException e) {
				APP_LOGS.debug("[info] Executing: | [>> ERROR <<]" + locator
						+ "not found to sendKeys|" + e.getMessage());
			}
		}

		public String getText(String locator) {
			String result = "";
			try {
				WebElement element = getWebElement(locator);
				return element.getText();
			} catch (NoSuchElementException e) {
				APP_LOGS.debug("[info] Executing:| [>> ERROR <<]" + locator
						+ "not found to getText|" + e.getMessage());
			}
			return result;
		}

		public void open(String url) {
			APP_LOGS.debug("[info] Executing: |open |" + url + "application|");
			driver.get(url);
		}

		public void close() {

			APP_LOGS.debug("[info] Executing: |close|");
			driver.quit();
		}
	}

