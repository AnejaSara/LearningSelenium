package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	//WebDriver driver;  							//always declare global since to be used across the project
	ChromeDriver driver;
	public  void initializeBrowser() {
		
		driver=new ChromeDriver();				//this driver class might change for firefox, edge etc
		//driver.get("http://selenium.qabible.in/simple-form-demo.php"); //to load url
		//driver.get("https://demo.guru99.com/test/upload/");
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.selenium.dev/");
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
