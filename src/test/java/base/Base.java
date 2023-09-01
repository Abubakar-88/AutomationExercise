package base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;



public class Base {
	protected static WebDriver driver;
	public static Properties property = new Properties();
	public static String host;
	public static FileInputStream fis;
	public static utilities.ExcelReader reader;
	
	public static void click(By by) {
		driver.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}

	public static void submit(By by){
		driver.findElement(by).submit();
	}
	public static void navigateURL(String url) {
		driver.get( url );
	}
	public static void dropDownvalue(By by, String name) {
		Select select = new Select(driver.findElement(by));
		select.selectByValue(name);
	}

	public static void mousehoover(By by) {
		Actions action = new Actions(driver);
		WebElement element2 = driver.findElement(by);
		action.moveToElement(element2).build().perform();
	}

	public static void switchToTab(String tabHandle) {
		driver.switchTo().window(tabHandle);
	}

	public static String getTabHandle() {
		return driver.getWindowHandle();
	}
	
	   public void fluentWaitClick(WebElement element) {
	        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(40))
	                .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", clickableElement);
	    }
	   
	   
	   
	   public void fluentWait(WebElement by) {
	        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(40))
	                .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	        WebElement element = wait.until(ExpectedConditions.visibilityOf(by));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].textContent;", element);
	    }

	public static void calender(By by, String value) {
		List<WebElement> signdates = driver.findElements(by);
		for (WebElement e : signdates) {
			String date = e.getText();
			if(date.equals(value)) {
				e.click();
				break;
			}
		}
				
	}
	
	public static void windowhandles() { // keep it for future use
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String childwindow : allWindowHandles) {
			if (!childwindow.equals(mainWindowHandle)) {
				driver.switchTo().window(childwindow);
				
			}
		}

	}
	

}
