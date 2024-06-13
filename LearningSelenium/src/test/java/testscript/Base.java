package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;  							//always declare global since to be used across the project
	public  void initializeBrowser() {
		
		driver=new ChromeDriver();				//this driver class might change for firefox, edge etc
		driver.get("https://www.google.com/");  //to load url
		driver.manage().window().maximize();    // to maximize the window
	}
	
	
	public void driverQuit() {
		
		driver.quit();
	}
	
	
	
	
	public static void main(String[] args) {
		
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuit();
		

	}

}
