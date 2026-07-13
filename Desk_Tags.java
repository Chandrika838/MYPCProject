package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Desk_Tags extends BasePage {

 public Desk_Tags(WebDriver driver) {
	 
	 super(driver);
 }

// locators 
 
 private By Admin = By.xpath("//span[normalize-space()='Admin']");
 private By Tools = By.xpath("//span[normalize-space()='Tools']");
 private By Desk = By.xpath("//button[normalize-space()='Desk Tools']");
 private By Tags = By.xpath("//button[normalize-space()='Tags']");
 private By createdTag = By.xpath("//span[@title='Chandrika user Tags']");
 private By CreatingTags = By.xpath("//input[@formcontrolname='name']");
 private By Update = By.xpath("//span[normalize-space()='Update']");
 
 
 // methods 
 
 public void ClickAdmin() {
	 
	 wait.until(ExpectedConditions.elementToBeClickable(Admin)).click();
 }
 
 public void ClikcTools() {
	 wait.until(ExpectedConditions.elementToBeClickable(Tools)).click();
 }

 
 public void ClickDesk() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Click Desk Tools via JS (safer than native click)
	    WebElement deskBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(Desk));
	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", deskBtn);
	    js.executeScript("arguments[0].click();", deskBtn);

	    // Wait until the accordion under Desk Tools is expanded AND Tags is visible inside it
	    wait.until(d -> (Boolean) ((JavascriptExecutor) d).executeScript(
	        "const btn = [...document.querySelectorAll('.collapse.show button')]" +
	        ".find(b => b.textContent.trim() === 'Tags' && b.offsetParent !== null);" +
	        "return !!btn;"));
	}

	public void ClickTags() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(
	        "const btn = [...document.querySelectorAll('.collapse.show button')]" +
	        ".find(b => b.textContent.trim() === 'Tags' && b.offsetParent !== null);" +
	        "btn.scrollIntoView({block:'center'});" +
	        "btn.click();");
	}
 

 public void ClickcreatedTags() {
	 
	 wait.until(ExpectedConditions.elementToBeClickable(createdTag)).click();
 }
 
 
 public void ClickCreatingTags() {
 
 wait.until(ExpectedConditions.elementToBeClickable(CreatingTags)).click();
 
 }
 
 public void ClickUpdate() {
	 wait.until(ExpectedConditions.elementToBeClickable(Update)).click();
	   
 }
 

}