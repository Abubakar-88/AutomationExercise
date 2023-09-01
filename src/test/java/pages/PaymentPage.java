package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class PaymentPage extends Base {
	
	
	
	@FindBy(name = "name_on_card")
    private WebElement nameOnCardInput;

    @FindBy(name = "card_number")
    private WebElement cardNumberInput;

    @FindBy(name = "cvc")
    private WebElement cvcInput;

    @FindBy(name = "expiry_month")
    private WebElement expiryMonthInput;

    @FindBy(name = "expiry_year")
    private WebElement expiryYearInput;

    @FindBy(id = "success_message")
    private WebElement successMessage;

    @FindBy(id = "submit")
    private WebElement payAndConfirmButton;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterNameOnCard(String name) {
        nameOnCardInput.sendKeys(name);
    }

    public void enterCardNumber(String cardNumber) {
        cardNumberInput.sendKeys(cardNumber);
    }

    public void enterCvcNumber(String cvc) {
        cvcInput.sendKeys(cvc);
    }

    public void enterExpiration(String month, String year) {
        expiryMonthInput.sendKeys(month);
        expiryYearInput.sendKeys(year);
    }

    public void clickPayAndConfirmOrder() {
        payAndConfirmButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
