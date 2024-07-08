package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base{
	
	public void navigationCommand()
	{
	
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");

	//driver.navigate().back();//navigate from amazon to google
	//driver.navigate().forward();//from google again back to amazon

	}
	public void actionclassMethod()
	{
		
	    WebElement draggablen0Element=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));// for draggable n01
	    WebElement dottedLineElement=driver.findElement(By.xpath("//div[@id='mydropzone']"));//for dotted line 
	    Actions actions=new Actions(driver);//creating obj for action class
	   
	    actions.moveToElement(draggablen0Element).build().perform();//to hover the mouse 
	    actions.doubleClick(draggablen0Element).build().perform();//to double click
	    actions.contextClick(draggablen0Element).build().perform();//for rightclick action
	    actions.dragAndDrop(draggablen0Element, dottedLineElement).build().perform();//for drag and drop
	
	}

	public static void main(String[] args) {
		ActionClass actionsclass=new ActionClass();
		actionsclass.initializeBrowser();
		actionsclass.navigationCommand();
		actionsclass.actionclassMethod();
		actionsclass.driverQuit();

	}

}
