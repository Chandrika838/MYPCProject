package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RoomPage  extends BasePage {

public RoomPage(WebDriver driver) {
	
	super(driver);
}

//locators 

private  By admin = By.xpath("//span[contains(text(),'Admin')]");

private  By room = By.xpath("//span[normalize-space()='Rooms']");	

private By addnew = By.xpath("//span[normalize-space()='Add New']");

private By roomname = By.xpath("//input[@formcontrolname='resourceName']");	

private By location = By.id("locationId");	

private By duration = By.id("defaultDuration");	

private By advanceoption = By.xpath("//button[normalize-space()='advanced options']");

private By prepration = By.id("preparationTime");

private By submit = By.xpath("//button[@type='submit']");


//Methods 

public void ClickAdmin() {

 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
}

//Asseration 

public boolean isAdminDispalyed() {

return isDisplayed(admin);
}

public void ClickRoom() {

wait.until(ExpectedConditions.elementToBeClickable(room)).click();

}

public boolean isRoomDisplayed() {

return isDisplayed(room);
}


public void ClickAddNew() {
	
	wait.until(ExpectedConditions.elementToBeClickable(addnew)).click();
}


public boolean isAddNewDisplayed() {

    return isDisplayed(addnew);
    
}



public void enterRoomName(String roomName) {

    wait.until(ExpectedConditions.visibilityOfElementLocated(roomname))
        .sendKeys(roomName);

   
}


public boolean isRoomNameDisplayed() {

return isDisplayed(roomname);
}



public void selectLocation(String value){

	Select select = new Select(getElement(location));
	select.selectByVisibleText(value);
	
}

public boolean isLocationDisplayed() {

return isDisplayed(location);
}


public void enterDefaultDUration(String value) {

enterText(duration, value);
}


public void ClickAdvanceOption1() {
	
	wait.until(ExpectedConditions.elementToBeClickable(advanceoption)).click();
}


public void selectPrepartion(String value) {
	
Select select = new Select(getElement(prepration));

select.selectByVisibleText(value);

}


public boolean isPrepartionDisplayed() {
	
	return isDisplayed(prepration);
}
public void clickSubmit() {

wait.until(ExpectedConditions.elementToBeClickable(submit)).click();

}

public boolean isSubmitDisplayed() {

return isDisplayed(submit);
}


}



