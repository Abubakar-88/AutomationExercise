package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class CheckoutPage extends Base{

	
	
	@FindBy(css = "a[href*='/view_cart']")
    private WebElement cartLink;
	
	
	 @FindBy(css = ".btn.check_out")
	  private WebElement proceedToCheckoutButton;
	 
	
	 
    @FindBy(id = "address_delivery")
    private WebElement deliveryAddressSection;

    @FindBy(id = "cart_info")
    private WebElement cartInfoSection;
 
    
    @FindBy(css = "textarea[name='message']")
    private WebElement commentTextArea;

    @FindBy(css = "a[href='/payment']")
    private WebElement placeOrderButton;
    
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	 public void clickProceedToCheckoutButton() {
	    	proceedToCheckoutButton.click();
	    }
	 
	 public void clickCartLink() {
	        fluentWaitClick(cartLink);
	    }
	 
	 public String getDeliveryAddress() {
		    fluentWait(deliveryAddressSection);
	        return deliveryAddressSection.getText();
	    }

	    public String getCartInfo() {
	        return cartInfoSection.getText();
	    }
	    
	    public void enterComment(String comment) {
	        commentTextArea.sendKeys(comment);
	    }

	    public void clickPlaceOrderButton() {
	        placeOrderButton.click();
	    }  
	    
	    
}
