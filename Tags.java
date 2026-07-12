package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Tags extends BasePage{
	
	public Tags(WebDriver driver) {
		
		super(driver);
	}

// locators 
	

private By admin = By.xpath("//span[normalize-space()='Admin']");

private By Tools = By.xpath("//span[normalize-space()='Tools']");

private By Users = By.xpath("//button[normalize-space()='User Tools']");

private By Tags = By.xpath("//div[@class='collapse show']//button[@type='button'][normalize-space()='Tags']");

private By UserName = By.xpath("//span[@title='Automation Tags']");

private By UsersTags = By.id("tagName");

private By checkbox = By.id("isSynchronized");

private By bookingRules = By.xpath("//button[normalize-space()='room booking rules']");

private By addNew = By.xpath("//div[@class='panel-transparent advancedContent collapse show']//button[@type='button'][normalize-space()='Add New']");


private By automation = By.cssSelector("span[title='Automation Tags']");
	

private By Pleasechoose = By.id("resourceTagId");

private By Submit = By.xpath("//form[@id='relationTagForm']//button[@type='submit']");

private By Update = By.xpath("//button[normalize-space()='Update']");
	

// Methods 

public void ClickAdmin() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
}
	
public void ClickTools() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Tools)).click();
}

public void ClickUsers() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Users)).click();
}

public void ClickTags() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Tags)).click();
}

public void ClickUserName() {
	
	    wait.until(ExpectedConditions.elementToBeClickable(UserName)).click();
	}
	

public void Clickautomation() {
	

    WebElement element = wait.until(
            ExpectedConditions.visibilityOfElementLocated(automation));

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].click();", element);

}

public void enterUserTag(String value) {

    WebElement textBox = wait.until(
            ExpectedConditions.visibilityOfElementLocated(UsersTags));

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript(
        "arguments[0].focus();" +
        "arguments[0].value=arguments[1];" +
        "arguments[0].dispatchEvent(new Event('input',{bubbles:true}));" +
        "arguments[0].dispatchEvent(new Event('change',{bubbles:true}));",
        textBox,
        value
    );
}



public void enableCheckbox() {

WebElement checkBox = wait.until(
  ExpectedConditions.presenceOfElementLocated(checkbox));

	    if (!checkBox.isSelected()) {
	        checkBox.click();
	    }
	}
		
   
public void ClickbookingRules() {
	 wait.until(ExpectedConditions.elementToBeClickable(bookingRules)).click();
	
}

public void ClickAddnew() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(addNew)).click();
}

public void ClickAutomation() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(automation)).click();
}

public void selectPleaseChoose(String value) {
	Select select = new Select(getElement(Pleasechoose));

	select.selectByVisibleText(value);
}

public void ClickSubmit() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Submit)).click();
}

public void ClickUpdate() {
	 wait.until(ExpectedConditions.elementToBeClickable(Update)).click();
	
}

}
