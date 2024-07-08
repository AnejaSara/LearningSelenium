package testscript;

public class BrowserCommands extends Base{
	
public void browserCommands() {
	String title=driver.getTitle(); // to get the tab name
	String url=driver.getCurrentUrl(); //to get the current url of he screen
	String pagesource=	driver.getPageSource(); // to get the page source
	
	}

public void navigationCommands() {
	driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	driver.navigate().back();
	driver.navigate().forward();
}

	public static void main(String[] args) {
		
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();

		browsercommands.navigationCommands();
		browsercommands.driverQuit();
	}

}
