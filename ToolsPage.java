package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ToolsPage  extends BasePage {
	
	public ToolsPage(WebDriver driver){
		
		super(driver);
	}

// locators 
	

private By admin = By.xpath("//span[normalize-space()='Admin']");

private By Tools = By.xpath("//span[normalize-space()='Tools']");

private By Users = By.xpath("//button[normalize-space()='User Tools']");
	
private By Tags = By.xpath("//div[@class='collapse show']//button[@type='button'][normalize-space()='Tags']");
	
private By addnew = By.xpath("//button[normalize-space()='Add New']");
	
private By add = By.xpath("//button[normalize-space()='Add']");	
	
// methods 

public void Clickadmin() {
	
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
	

public void Clickaddnew() {
	

    WebElement button = wait.until(
            ExpectedConditions.visibilityOfElementLocated(addnew));

    // creating a constuctor 
    
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].scrollIntoView({block:'center'});", button);

    js.executeScript("arguments[0].click();", button);
	
}
public void enterTagName(String tagName) {
	
	wait.until(driver -> {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        return (Boolean) js.executeScript(
                "return !!(document.querySelector('.modal.show input#tagName') || document.querySelector('input#tagName'));");

    });

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript(
            "const el=document.querySelector('.modal.show input#tagName') || document.querySelector('input#tagName');"
                    + "el.focus();"
                    + "el.value=arguments[0];"
                    + "el.dispatchEvent(new Event('input',{bubbles:true}));"
                    + "el.dispatchEvent(new Event('change',{bubbles:true}));"
                    + "el.blur();",
            tagName);
	
	
}

public void clickAdd() {
	
	 WebElement button = wait.until(
             ExpectedConditions.visibilityOfElementLocated(add));

     JavascriptExecutor js = (JavascriptExecutor) driver;

     js.executeScript("arguments[0].click();", button);
}
	
}


