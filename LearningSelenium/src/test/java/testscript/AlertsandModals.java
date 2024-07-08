package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsandModals extends Base {

	
	public void navigationCommand()
	{
	
	//driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	driver.navigate().to("https://selenium.qabible.in/window-popup.php");
	
	//driver.navigate().back();//navigate from amazon to google
	//driver.navigate().forward();//from google again back to amazon

	}
	public void alertsandmodelsJavascriptAlert()
	{
	    WebElement simpleAlertElement=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	    simpleAlertElement.click();
	    
	    String alertValue=driver.switchTo().alert().getText();//to get pop up text 
	    driver.switchTo().alert().accept();//for ok button 
	    
	    
	    WebElement configurationAlertElement=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	    configurationAlertElement.click();
	    driver.switchTo().alert().dismiss();//to dismiss the pop up
	    
	    
	    WebElement promptAlertElement=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	    promptAlertElement.click();
	    driver.switchTo().alert().sendKeys("Aneja Domini");	
	    driver.switchTo().alert().accept();
	   
	}
	public void alertsandmodelsWindowPopup()
	{
	    WebElement likeUsElement=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	   
	    likeUsElement.click();
	    String mainWindow=driver.getWindowHandle();
	    Set<String> s1=driver.getWindowHandles();
	    
	    Iterator<String> childWindow=s1.iterator();
	    while(childWindow.hasNext()) {
			 
			 String currentWindow=childWindow.next();
			 if(!mainWindow.equals(currentWindow))			 
             {    		 
                  
                    // Switching to Child window 
                     driver.switchTo().window(currentWindow); 
                     WebElement loginbutton=driver.findElement(By.xpath("//form[@id='login_popup_cta_form']/descendant::div[@aria-label=\"Accessible login button\"]"));   
                   boolean isLoginbuttonDisplayed=loginbutton.isDisplayed();
                    //log in btn display code 
                     driver.close(); 
                     driver.switchTo().window(mainWindow); 
                     
            }
		 }
		 
	}
	
	public void loginButtonCheck() {
		
	}
	
	public static void main(String[] args) {
		AlertsandModals alertsandmodals=new AlertsandModals();
		alertsandmodals.initializeBrowser();
		alertsandmodals.navigationCommand();
		//alertsandmodals.alertsandmodelsJavascriptAlert();
		alertsandmodals.alertsandmodelsWindowPopup();
		alertsandmodals.driverQuit();
	}

}
