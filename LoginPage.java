package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

// locators 
    
    // now we using all the locatrs to use them  in the methods 
    
  private By email = By.id("email");
  
  private By password = By.id("password");
  
  private By highContrastSwitch = By.id("highContrastSwitch");
 
  private By loginButton = By.cssSelector("button.btn-login");
   
  // We are Methods
  
  public void enterEmail(String userEmail) {
	  
	  enterText(email, userEmail);
	  
  }
  
  public void enterPassword(String userPassword) {
	  enterText(password, userPassword);
	  
  }
  
  
  public void enableHighContrast() {

      if (!getElement(highContrastSwitch).isSelected()) {
          click(highContrastSwitch);
          
     // Assertation 
          
    Assert.assertTrue(isHighContrastEnabled(),"High is not enabled");
      }
  }

  public boolean isHighContrastEnabled() {
      return getElement(highContrastSwitch).isSelected();
     
  }
  
 public void clickLogin() {
	 
	 click(loginButton);
	 
	 

 }
  
 
 public boolean isLoginButtonDisplayed() {
	 
	 return isDisplayed(loginButton);
 }
 
 // resuable login Method 
 
 
 public void login(String emailAddress, String passwordValue) {
	 
	 enterEmail(emailAddress);
	 enterPassword(passwordValue);
	 enableHighContrast();
	 clickLogin();
	 
 }
 }
  