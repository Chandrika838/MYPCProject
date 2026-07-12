package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Reserve_Computer_Page extends BasePage {

	public Reserve_Computer_Page(WebDriver driver) {
		
		super(driver);

	}
	
	
// locators 
	
 private By reserve = By.xpath("//span[normalize-space()='Reserve']");
 
 private By computer = By.xpath("//span[contains(text(),'Computers')]");

 private By location2 = By.xpath("//app-location-selector//select");
 

 private By Tooltips =
		 By.xpath("//div[contains(@class,'bs-slot') and contains(@class,'bs-available')]");
 
 private By StartTime2 = By.xpath("//app-time-selector[@formcontrolname='startTime']//select");
 
 private By SelfBookings = By.id("selfBooking");
 
 private By Books = By.xpath("//button[@type='submit']");
 
 
 // Methods 
 
 
 public void ClickReserve() {
	 
		wait.until(ExpectedConditions.elementToBeClickable(reserve)).click();
	 
 }
 
 
public void ClickComputer() {

	wait.until(ExpectedConditions.elementToBeClickable(computer)).click();
	
}
 

public void SelectLocation2(String value ) {
	
	Select select = new Select(getElement(location2));
	
	select.selectByVisibleText(value);
	
}


public void ClickTooltips() {

        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(Tooltips)))
            .click();

    }




public void SelectStartTime2(String value) {
	
	 WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(StartTime2));

	    // Wait until the dropdown is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(dropdown));

	    // Create Select object
	    Select select = new Select(dropdown);

	    
	    // Select the value
	    select.selectByVisibleText(value);
}



public void EnableSelfBookings() {
	
	WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(SelfBookings));
	
	if(!checkbox.isSelected()) {
		checkbox.click();
	}
}


public void ClickBooks() {
	
	click(Books);
}
}
 
 
 
 
 
 
 
		

