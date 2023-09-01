package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base{
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigateUrl(String url) {
		navigateURL(url);
	}

    public String getPageTitle() {
    	return driver.getTitle();
    }

}
