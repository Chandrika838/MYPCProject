package POM;

import org.testng.annotations.Test;

import Utilities.ConfigReader;

public class Tags_TestCase extends BaseTest {

	ConfigReader config = new ConfigReader();
	
	// create the constructor 
	
@Test 

public void VerifyAddTags () {
	

// create a constructor 
	
	
LoginPage loginPage = new LoginPage(driver); 
	
loginPage.enterEmail(config.getEmail());

loginPage.enterPassword(config.getPassword());

loginPage.clickLogin();


// create a constructor 

Tags TagsPage = new Tags(driver);

TagsPage.ClickAdmin();
TagsPage.ClickTools();
TagsPage.ClickUsers();
TagsPage.ClickTags();
TagsPage.ClickUserName();
TagsPage.enterUserTag("Automation Tags");
TagsPage.enableCheckbox();
TagsPage.ClickbookingRules();
TagsPage.ClickAddnew();
TagsPage.ClickAutomation();
TagsPage.selectPleaseChoose(config.getPleasechoose());
TagsPage.ClickSubmit();	
	
	
	
}

}
