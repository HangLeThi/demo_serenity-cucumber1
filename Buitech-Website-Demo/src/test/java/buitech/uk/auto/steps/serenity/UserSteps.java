package buitech.uk.auto.steps.serenity;

import buitech.uk.auto.pages.BuitechPage;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BuitechPage buitechPage;
	public void open_browser(String arg1) {
		buitechPage.open();
		
	}
	public void maximize_browser() {
	getDriver().manage().window().maximize();
		
	}
	public void click_on_link(String arg1) {
		buitechPage.click_link(arg1);
		
	}
	/*public void scroll_down(int x) {
		buitechPage.scroll_emlemt_down(200);
		
	}*/

}
