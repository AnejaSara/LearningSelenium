package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsSample extends Base{
	
	public void findElementsSample(String menuBuffer) {
		List<WebElement> menuList=driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//a"));
		for(WebElement menu:menuList) {
			String text=menu.getText();
			if(text.equals(menuBuffer)) {
				menu.click();
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
		FindElementsSample findelementsample=new FindElementsSample();
		findelementsample.initializeBrowser();
		findelementsample.findElementsSample("Radio Buttons Demo");
		findelementsample.driverQuit();
	}

}
