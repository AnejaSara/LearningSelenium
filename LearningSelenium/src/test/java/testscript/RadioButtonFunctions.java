package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonFunctions extends Base {
	
	public void radionButtonMethods() {
		
		WebElement radioButtonLink=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioButtonLink.click();
		
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1' and @type='radio']"));
		boolean isRadioButtonDisplayed=maleRadioButton.isDisplayed();
		String maleRadioButtonName=maleRadioButton.getText();
		maleRadioButton.click();
		boolean isRadioMaleSelected=maleRadioButton.isSelected();
		
		WebElement showValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showValueButton.click();
		
		WebElement messageLabel=driver.findElement(By.xpath("//div[@id='message-one']"));
		String displayMessage=messageLabel.getText();
		if(displayMessage.substring(14).equals(maleRadioButtonName)) {
			System.out.println("Messages matched to Text");
		}
		
	}

	public static void main(String[] args) {
		
		RadioButtonFunctions radiobuttonfunctions=new RadioButtonFunctions();
		radiobuttonfunctions.initializeBrowser();
		radiobuttonfunctions.radionButtonMethods();
		radiobuttonfunctions.driverQuit();
		

	}

}
