package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	
	public void dropDownMethods() {
		
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		select.selectByIndex(1); // to select an option using index -- this is not much used
		select.selectByVisibleText("Yellow"); // to select an option using the visible 
		select.selectByValue("Green"); // to select an option by value
	}

	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.initializeBrowser();
		dropdown.dropDownMethods();
		dropdown.driverQuit();

	}

}
