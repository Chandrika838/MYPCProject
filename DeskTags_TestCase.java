package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.ConfigReader;

public class DeskTags_TestCase extends BaseTest{

	ConfigReader config = new ConfigReader();
	
	@Test
	
	public void verifyDeskTags() {
	
	LoginPage loginPage = new LoginPage(driver);
	
    loginPage.enterEmail(config.getEmail());

    loginPage.enterPassword(config.getPassword());

    loginPage.clickLogin();

    Desk_Tags desk = new Desk_Tags(driver);

    desk.ClickAdmin();
    desk.ClikcTools();
    desk.ClickDesk();
    desk.ClickTags();
    desk.ClickcreatedTags();
    desk.ClickCreatingTags();
    
    
	}
}