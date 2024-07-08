package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxFunctions extends Base{
	
	public void checkBoxMethods() {
		String checkMessage="Success - Check box is checked";
		WebElement checkPageLink=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkPageLink.click();
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox.click();
		
		WebElement message=driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
		String fullMessageText=message.getText();
		
		if(fullMessageText.equals(checkMessage)) {
			System.out.println("Message Matches");
		}
		
	}

	public static void main(String[] args) {
		CheckBoxFunctions checkboxfunctions=new CheckBoxFunctions();
		checkboxfunctions.initializeBrowser();
		checkboxfunctions.checkBoxMethods();
		checkboxfunctions.driverQuit();

	}

}
