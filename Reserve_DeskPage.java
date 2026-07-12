package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Reserve_DeskPage extends BasePage{


	public Reserve_DeskPage(WebDriver driver) {
	
	super(driver);
	
	
	// locator 
	
	}
	
	
private By reserve = By.xpath("//span[normalize-space()='Reserve']");
	
private By desk = By.xpath("//span[normalize-space()='Desk']");	
	
private By location = By.xpath("//app-location-selector//select");

private By tooltip = By.xpath("(//div[contains(@class,'bs-slot') and contains(@class,'bs-available')])[1]");
	
private By StartTime1 = By.xpath("//app-time-selector[@formcontrolname='startTime']//select");

private By dragDrop = By.xpath("//div[@class='bs bs-marker']");
	
private By selfBooking = By.id("selfBooking");

private By book = By.xpath("//span[normalize-space()='Book']");


// methods 


public void ClickReserve() {
	
	wait.until(ExpectedConditions.elementToBeClickable(reserve)).click();
	
}


public void ClickDesk() {
	
	wait.until(ExpectedConditions.elementToBeClickable(desk)).click();
}


public void SelectLocation(String value ) {
	
	Select select = new Select(getElement(location));
	
	select.selectByVisibleText(value);
	
}


public void ClickToolTip() {
	

	    WebElement tooltipElement = wait.until(
	            ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(tooltip)));

	    tooltipElement.click();
	}



public void SelectStartTime1(String value) {
	 WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(StartTime1));

	    // Wait until the dropdown is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(dropdown));

	    // Create Select object
	    Select select = new Select(dropdown);

	    
	    // Select the value
	    select.selectByVisibleText(value);
}
	

public void ClickDragDrop() {
	
	  WebElement drag = wait.until(
   
		ExpectedConditions.elementToBeClickable(dragDrop));

	new Actions(driver).dragAndDropBy(drag,15, 0).perform(); 
	
}

public void enableSelfBooking() {
	
	WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(selfBooking));
	
	if(!checkbox.isSelected()) {
		checkbox.click();
	}
}


public void ClickBook() {
	
	click(book);
}


}
