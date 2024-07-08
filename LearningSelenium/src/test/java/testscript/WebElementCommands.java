package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	
	public void verifySingleInputField() {
		String inputToTextField="Mary had a little lamp";
		WebElement enterMessageTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessageTextField.sendKeys(inputToTextField); // to enter the text to the field
		
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String tagName=showMessageButton.getTagName(); // to get tag name of the element
		String id=showMessageButton.getAttribute("id");
		String backgroundColour=showMessageButton.getCssValue("background-color");
		showMessageButton.click(); //to click on any element
		
		WebElement yourMessageLabel=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText=yourMessageLabel.getText();  // to get text from website
		
		//using contains()
		if(yourMessageText.contains(inputToTextField)) {
			System.out.println("Message displayed is correct");
		}
			
			
		//using split()
		String splittedString[]=yourMessageText.split(":");
		if(splittedString[1].equals(" "+inputToTextField)) {
			System.out.println("Text displayed is correct");
		}
		
		//using substring()
		if(yourMessageText.substring(15).equals(inputToTextField)) {
			System.out.println("Messages matched to Text");
		}
	}
	

	public static void main(String[] args) {
		
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.verifySingleInputField();
		webelementcommands.driverQuit();
	}

}
