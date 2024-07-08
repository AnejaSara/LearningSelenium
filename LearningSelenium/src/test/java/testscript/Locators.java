package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void locatorMethods() {
		
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement clearfix=driver.findElement(By.className("clearfix"));
		WebElement linkText=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialText=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement name=driver.findElement(By.name("viewport"));
		WebElement tagname=driver.findElement(By.tagName("title"));
		
		WebElement csswithid=driver.findElement(By.cssSelector("button#button-one"));
		WebElement csswithname=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement csswithattribute=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
	
	 WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']"));
	}

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.locatorMethods();
		locators.driverQuit();

	}

}
