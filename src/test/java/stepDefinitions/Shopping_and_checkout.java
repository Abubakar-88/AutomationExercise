package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.PaymentPage;
import pages.SignupPage;
import utilities.ExcelReader;

public class Shopping_and_checkout extends Base{

	
	  HomePage homePge = new HomePage(driver);
	  
	  CartPage cartPage = new CartPage(driver);
	  SignupPage signupPage = new SignupPage(driver);
	  CheckoutPage checkoutPage = new CheckoutPage(driver);
	  
	  PaymentPage paymentPage = new PaymentPage(driver);
	  
	    String email;
	    String password;
	     String name;
	     String day;
	     String month;
	     String year;
	     String firstName;
	     String lastName;
	     String company;
	     String address1;
	     String address2;
	     String country;
	     String state;
	     String city;
	     String zipcode;
	     String mobileNumber;
	     String expectedAddress;
	  
	  public static boolean switchtoRightWindow(String windowTitle, List<String> hList) {
		  for(String e : hList) {
			  String title = driver.switchTo().window(e).getTitle();
			  if(title.contains(windowTitle)) {
				  System.out.println("found the right window");
				  return true;
			  }
		  }
		  return false;
	}
	  
	  
	   @Given("I am on the homepage")
	    public void i_am_on_the_homepage() {
		   homePge.navigateUrl(host);
	    }

	    @When("Verify that homepage is visible")
	    public void verify_that_homepage_is_visible() {
	        String expectedTitle = "Automation Exercise";
	        String actualTitle = homePge.getPageTitle();
	        Assert.assertEquals("Homepage title doesn't match", expectedTitle, actualTitle);
	    }
	
	    
	    @When("I add products to the cart")
	    public void i_add_products_to_the_cart() {
	        cartPage.clickAddToCartButton();
	    }

	    @When("I click the Cart button")
	    public void i_click_the_Cart_button() {
	 
	    	Set<String> handles = driver.getWindowHandles();
			List<String> hList = new ArrayList<String>(handles);
			if (switchtoRightWindow("Added!", hList)) {
			}
	    	
			WebDriverWait wait = new WebDriverWait(driver, 20); 
		    wait.until(ExpectedConditions.elementToBeClickable(cartPage.getViewCartLink()));
		    
		    cartPage.clickViewCartButton();
	       
	    }

	    @When("Verify Cart Page is Displayed")
	    public void verify_Cart_Page_is_Displayed() {
	        Assert.assertTrue("Not on the cart page", cartPage.isOnCartPage());
	    }  
	    @When("I click Proceed To Checkout")
	    public void i_click_Proceed_To_Checkout() {
	       cartPage.clickProceedToCheckoutButton();
	    }

	    @When("I am Taking data from excel {string} and {int}")
	    public void i_am_Taking_data_from_excel_and(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
	    	reader = new ExcelReader();
			List<Map<String,String>> readData = 
					reader.getData(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\AutoData.xlsx", sheetName);		
			 email = readData.get(rowNumber).get("Email");
			 name = readData.get(rowNumber).get("Name");
			 password = readData.get(rowNumber).get("Password"); 
			 day = readData.get(rowNumber).get("Day"); 
			 month = readData.get(rowNumber).get("Month"); 
			 year = readData.get(rowNumber).get("Year"); 
			 firstName = readData.get(rowNumber).get("First name"); 
			 lastName = readData.get(rowNumber).get("Last name"); 
			 company = readData.get(rowNumber).get("Company"); 
			 address1 = readData.get(rowNumber).get("Address"); 
			 address2 = readData.get(rowNumber).get("Address 2"); 
			 country = readData.get(rowNumber).get("Country"); 
			 state = readData.get(rowNumber).get("State"); 
			 city = readData.get(rowNumber).get("City"); 
			 zipcode = readData.get(rowNumber).get("Zipcode"); 
			 mobileNumber = readData.get(rowNumber).get("Mobile Number");
			 expectedAddress = readData.get(rowNumber).get("DELIVERY ADDRESS");
	    }
	      

	    @When("I click Register / Login button")
	    public void i_click_Register_Login_button() {
	    	Set<String> handles = driver.getWindowHandles();
			List<String> hList = new ArrayList<String>(handles);
			if (switchtoRightWindow("Checkout", hList)) {
			}
	    	
			WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
		    wait.until(ExpectedConditions.elementToBeClickable(cartPage.getRegisterLink()));
		    
		    cartPage.clickRegisterButton();
	    }

	    // SignupPage
	    
	    @Then("I enter name")
	    public void i_enter_name() {
	       
	        signupPage.inputName(name);
	    }

	    @Then("I enter email")
	    public void i_enter_email() {
	    	signupPage.inputEmail(email);
	    }

	    @Then("I click signup button")
	    public void i_click_signup_button() {
	    	signupPage.clickSignupbtn();
	    }
	    
	    @Then("I click Title of name")
	    public void i_click_title_of_name() {
	    	signupPage.clickTitleOfName();
	    }

	    @Then("I fill password")
	    public void i_fills_password() {
	    	signupPage.sendFillPassword(password);
	    }
	    
	    @Then("I select date of birth")
	    public void i_select_date_of_birth() {
	    	
	    	//Day select
	       signupPage.clickDays();
	       Select dropdownSelect = new Select(signupPage.getClickDays());
	       dropdownSelect.selectByVisibleText(day);
	       
	       //Month select
	       signupPage.clickMonths();
	       Select dropdownSelectMonth = new Select(signupPage.getClickMonths());
	       dropdownSelectMonth.selectByVisibleText(month);
	       
	       //Year select
	       signupPage.clickYears();
	       Select dropdownSelectYear = new Select(signupPage.getClickYears());
	       dropdownSelectYear.selectByVisibleText(year);
	       
	    }
	    
	    @Then("I fill first name")
	    public void i_fills_first_name() {
	    	
	    	signupPage.inputFirstName(firstName);
	    }
	    
	    
	    @Then("I fill last name")
	    public void i_fills_last_name() {
	    	signupPage.inputLastName(lastName);
	    }
	    
	    @Then("I fill company name")
	    public void i_fills_company_name() {
	    	signupPage.inputCompanyName(company);
	    } 
	    
	    @Then("I fill address1")
	    public void i_fills_address1() {
	    	signupPage.inputAdress1Name(address1);
	    } 
	    
	    @Then("I fill address2")
	    public void i_fills_address2() {
	    	signupPage.inputAdress2Name(address2);
	    } 
	    
	    @Then("I select country name")
	    public void i_select_country_name() {
	    	signupPage.countrySelect();
	    	Select dropdownSelect = new Select(signupPage.getSelectCountry());
		       dropdownSelect.selectByVisibleText(country);
	    } 
	    
	    @Then("I fill state name")
	    public void i_fills_state_name() {
	    	signupPage.inputStateName(state);
	    } 
	    
	    @Then("I fill city name")
	    public void i_fills_city_name() {
	    	signupPage.inputCityName(city);
	    } 
	    
	    @Then("I fill zipcode")
	    public void i_fills_zipcode() {
	    	signupPage.zipcodeInput(zipcode);
	    } 
	    
	    @Then("I fill mobile number")
	    public void i_fills_mobile_number() {
	    	signupPage.inputMobileNumber(mobileNumber);
	    } 
	
	    @Then("I click create account button")
	    public void i_click_create_account_button() {
	    	signupPage.clickCreateAccountbtn();
	    } 
	    
	    
	    @When("I verify ACCOUNT CREATED! message")
	    public void i_verify_ACCOUNT_CREATED_message() throws InterruptedException {
	    	
	        String expectedMessage = "ACCOUNT CREATED!";
	        String actualMessage = signupPage.getAccountCreatedMessage();

	        assert actualMessage.contains(expectedMessage);
	    }

	    @When("I click the continue button")
	    public void i_click_the_continue_button() {
	      signupPage.clickContinueButton();
	      

	    }
	    
	    @Then("the username is displayed as {string}")
	    public void usernameIsDisplayed(String expectedUsername) {
	    	
	        String actualUsername = signupPage.getLoggedInUsername();
	       assert actualUsername.contains(expectedUsername);
	        
	    
	    }
	   
	    //CheckoutPage
	    
	    @When("I click the cart menu")
	    public void I_click_the_cart_menu() {
	    	checkoutPage.clickCartLink();
	    }  
	    
	    @When("I click Proceed to Checkout of cart page")
	    public void proceedToCheckoutPage() {
	    	checkoutPage.clickProceedToCheckoutButton();
	    }  
	    
	    @Then("the delivery address is displayed")
	    public void verifyDeliveryAddress()  {
	    
	        String actualAddress = checkoutPage.getDeliveryAddress();
	        System.out.println("delivery address: "+ actualAddress);
	        assert actualAddress.trim().toLowerCase().contains(expectedAddress.trim().toLowerCase());
	      
	    } 
	    
	    @Then("the cart information is displayed")
	    public void verifyCartInfo() {
	        String cartInfo = checkoutPage.getCartInfo();

	        assert cartInfo.contains("Blue Top");

	        // Verify total amount
	        assert cartInfo.contains("Total Amount");
	        assert cartInfo.contains("Rs. 500");
	    }
	    
	    @When("I enter description {string} in comment text area and click Place Order")
	    public void enterDescriptionAndPlaceOrder(String comment) {
	        checkoutPage.enterComment(comment);
	        checkoutPage.clickPlaceOrderButton();

//	        
	    }
	    
	    //PaymentPage
	    
	    @When("I enter Name on Card")
	    public void enterNameOnCard() {
	        paymentPage.enterNameOnCard("John Doe"); 
	    }

	    @When("I enter card number")
	    public void enterCardNumber() {
	        paymentPage.enterCardNumber("1234567890123456"); 
	    }

	    @When("I enter CVC number")
	    public void enterCvcNumber() {
	        paymentPage.enterCvcNumber("123"); 
	    }

	    @When("I enter expiration {string} and {string}")
	    public void enterExpiration(String month, String year) {
	        paymentPage.enterExpiration(month, year);
	    }

	    @When("I click pay and confirm order")
	    public void clickPayAndConfirmOrder() {
	        paymentPage.clickPayAndConfirmOrder();
	    }

	    @Then("Verify order confirmation")
	    public void verifyOrderConfirmation() {
	       
	        assert paymentPage.isSuccessMessageDisplayed();
	    }

}
