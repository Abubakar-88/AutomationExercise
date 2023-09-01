package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class CartPage extends Base{
	
    @FindBy(css = ".add-to-cart")
    private WebElement addToCartButton; 

    @FindBy(linkText = "View Cart")
    private WebElement viewCartLink;

    @FindBy(id = "cart_info_table")
    private WebElement cartTable;

    @FindBy(id = "empty_cart")
    private WebElement emptyCartMessage;
    
    
    @FindBy(css = ".btn.check_out")
    private WebElement proceedToCheckoutButton;
    
    @FindBy(linkText = "Register / Login")
    private WebElement registerLink;
    
	public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartButton() {
    	fluentWaitClick(addToCartButton);
    }

    public void clickViewCartButton() {
        viewCartLink.click();
    }
    public boolean isOnCartPage() {
        return cartTable.isDisplayed() || emptyCartMessage.isDisplayed();
    }

    public WebElement getViewCartLink() {
        return viewCartLink;
    }
	
    public void clickProceedToCheckoutButton() {
    	proceedToCheckoutButton.click();
    }
    
    public void clickRegisterButton() {
        registerLink.click();
    }
    public WebElement getRegisterLink() {
        return registerLink;
    }

}
