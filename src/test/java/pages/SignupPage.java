package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class SignupPage extends Base {
	
    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signupButton;
	
    @FindBy(id = "id_gender1")
    private WebElement titleOfName;
	
    @FindBy(id = "password")
    private WebElement fillPassword;
    
    @FindBy(id = "days")
    private WebElement clickDays;
    
    @FindBy(id = "months")
    private WebElement clickMonths;
    
    
    @FindBy(id = "years")
    private WebElement clickYears;
    
    
    @FindBy(id = "first_name")
    private WebElement firstNameInput;
    
    @FindBy(id = "last_name")
    private WebElement lastNameInput;
    
    @FindBy(id = "company")
    private WebElement campanyNameInput;
    
    @FindBy(id = "address1")
    private WebElement address1Input;
    
    @FindBy(id = "address2")
    private WebElement address2Input;
    
    
    @FindBy(id = "country")
    private WebElement selectCountry;
    
    @FindBy(id = "state")
    private WebElement inputState;
    
    @FindBy(id = "city")
    private WebElement inputCity;
    
    
    @FindBy(name = "zipcode")
    private WebElement inputZipcode;
    
    @FindBy(id = "mobile_number")
    private WebElement inputMobileNumber;
    
    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccountButton;
    
    
    @FindBy(css = "h2[data-qa='account-created']")
    private WebElement accountCreatedMessage;

    @FindBy(css = "a[data-qa='continue-button']")
    private WebElement continueButton;
    
    @FindBy(xpath = "//a[contains(text(),'Logged in') ]")
    private WebElement loggedInUsername;
    
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void inputName(String name) {
    	nameInput.sendKeys(name);
    }
    public void inputEmail(String email) {
    	emailInput.sendKeys(email);
    }
    
    public void clickSignupbtn() {
    	signupButton.click();
    }
    
    
    public void clickTitleOfName() {
    	fluentWaitClick(titleOfName);
    }
    
    public void sendFillPassword(String password) {
    	fluentWait(fillPassword);
    	fillPassword.sendKeys(password);
    }
    
    public void clickDays() {
    	fluentWaitClick(clickDays);
    	clickDays.click();
    }
    
    public WebElement getClickDays() {
    	return clickDays;
    }
    
  
    
    public void clickMonths() {
    	clickMonths.click();
    }
    
    public WebElement getClickMonths() {
    	return clickMonths;
    }
    
    
    public void clickYears() {
    	clickYears.click();
    }
    
    public WebElement getClickYears() {
    	return clickYears;
    }
  
    public void inputFirstName(String fName) {
    	firstNameInput.sendKeys(fName);
    }
    
    public void inputLastName(String lName) {
    	lastNameInput.sendKeys(lName);
    }
    
    
    public void inputCompanyName(String companyName) {
    	campanyNameInput.sendKeys(companyName);
    }
    
    public void inputAdress1Name(String address1) {
    	address1Input.sendKeys(address1);
    }
    
    public void inputAdress2Name(String address2) {
    	address2Input.sendKeys(address2);
    }
 
    public void countrySelect() {
    	selectCountry.click();
    }
    
    public WebElement getSelectCountry() {
    	return selectCountry;
    }
    
    public void inputStateName(String state) {
    	inputState.sendKeys(state);
    }
    
    public void zipcodeInput(String zipcode) {
    	inputZipcode.sendKeys(zipcode);
    }
    
    public void inputCityName(String city) {
    	inputCity.sendKeys(city);
    }
    
    public void inputMobileNumber(String mNumber) {
    	inputMobileNumber.sendKeys(mNumber);
    }
    
    public void clickCreateAccountbtn() {
    	createAccountButton.click();
    }
    
    public String getAccountCreatedMessage() {
    	 WebDriverWait wait = new WebDriverWait(driver, 20); // Wait for up to 10 seconds
         wait.until(ExpectedConditions.visibilityOf(accountCreatedMessage));
        return accountCreatedMessage.getText();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
 
    
    public String getLoggedInUsername() {
    	fluentWait(loggedInUsername);
          return loggedInUsername.getText();
    }
    
}
