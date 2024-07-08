package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base {
	
	public void xpathMethods() {
		
		WebElement xpath1=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement xpath2=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement xpathtext=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xpathor=driver.findElement(By.xpath("//button[text()='Show ' or @id='button-one']"));
		WebElement xpathand=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
	}
	
	public void xpathAxes() {
		
		//Following 
		 
 		WebElement xpathFollowing=driver.findElement(By.xpath("//div[@id='message-one']//following::button[@id='button-two']")); 
 		WebElement xpathFollowing1=driver.findElement(By.xpath("//div[@class='form-group']//following::input[@id='value-a']")); 
 		WebElement xpathFollowing2=driver.findElement(By.xpath("//div[@class='form-group']//following::input[@id='value-b']")); 
 		 
 		//Preceding 
 		 
 		WebElement xpathPreceding=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@class='btn btn-primary']")); 
 		WebElement xpathPreceding1=driver.findElement(By.xpath("//button[@id='button-one' ]//preceding::label[@for='inputEmail4']")); 
 	     
 		//To identify Parent shortcut 
 		 
 		WebElement xpathParent=driver.findElement(By.xpath("//button[@id='button-one']/.."));// to identify parent shortcut method 
 	     
 		//Child 
 		WebElement xpathChild=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']")); 
 		WebElement xpathChild1=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-two']")); 
 		 
 		//Parent 
 		WebElement xPathParent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form[@method='POST']"));	
	}
	
	public void xpathAncestor() {
		
		WebElement xpathAncestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
		
	}
	

	public static void main(String[] args) {
		XpathLocator xpathlocator=new XpathLocator();
		xpathlocator.initializeBrowser();
		xpathlocator.xpathMethods();
		xpathlocator.driverQuit();

	}

}
