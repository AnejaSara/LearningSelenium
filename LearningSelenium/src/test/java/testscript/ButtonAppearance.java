package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ButtonAppearance extends Base {
	
	
	
	public void showMessageAppearance() {
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	String fondColor=showMessageButton.getCssValue("color");
	if(fondColor.equals("rgba(255, 255, 255, 1)")) {
		System.out.println("Expected fond color returned");
	}
		
	}
public void getTotalAppearance() {
	
	WebElement getTotalButton=driver.findElement(By.xpath("//button[@id=\"button-two\"]"));
	String backgroundColor=getTotalButton.getCssValue("background-color");
	if(backgroundColor.equals("rgba(0, 123, 255, 1)")) {
		System.out.println("Expected fond color returned");
	}
	}
	

	public static void main(String[] args) {
		
		ButtonAppearance buttonappearance= new ButtonAppearance();
		buttonappearance.initializeBrowser();
		buttonappearance.showMessageAppearance();
		buttonappearance.getTotalAppearance();
		buttonappearance.driverQuit();
		
	}

}
