package testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignments extends Base {
	
	public void differentLocators() {
		
		WebElement id1=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement id2=driver.findElement(By.id("nav-search-submit-text"));
		WebElement id3=driver.findElement(By.id("nav-logo-sprites"));
		WebElement id4=driver.findElement(By.id("searchDropdownBox"));
		WebElement id5=driver.findElement(By.id("nav-search-submit-button"));
		
		WebElement class1=driver.findElement(By.className("nav-search-field"));
		WebElement class2=driver.findElement(By.className("nav-line-1-container"));
		WebElement class3=driver.findElement(By.className("hm-icon-label"));
		WebElement class4=driver.findElement(By.className("icp-nav-link-inner"));
		WebElement class5=driver.findElement(By.className("nav-search-facade"));
		
		WebElement linkText1=driver.findElement(By.linkText("Amazon miniTV"));
		WebElement lintText2=driver.findElement(By.linkText("Sell"));
		WebElement linkText3=driver.findElement(By.linkText("Best Sellers"));
		WebElement linkText4=driver.findElement(By.linkText("Today's Deals"));
		WebElement linkTest5=driver.findElement(By.linkText("Fashion"));
		
		
		WebElement partiallinktext1=driver.findElement(By.partialLinkText("Today's"));
		WebElement partiallinktext2=driver.findElement(By.partialLinkText("New"));
		WebElement partiallinktext3=driver.findElement(By.partialLinkText("Home &"));
		WebElement partiallinktext4=driver.findElement(By.partialLinkText("miniTV"));
		WebElement partiallinktext5=driver.findElement(By.partialLinkText("Car &"));
		
		
		WebElement name1=driver.findElement(By.name("description"));
		WebElement name2=driver.findElement(By.name("keywords"));
		WebElement name3=driver.findElement(By.name("google-site-verification"));
		WebElement name4=driver.findElement(By.name("encrypted-slate-token"));
		WebElement name5=driver.findElement(By.name("msvalidate.01"));
		
		
		WebElement css1=driver.findElement(By.cssSelector("input#unifiedLocation1ClickAddress"));
		WebElement css2=driver.findElement(By.cssSelector("div.nav-search-facade"));
		WebElement css3=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		
		
		WebElement xpathaxefollowing1=driver.findElement(By.xpath("//div[@id='desktop-grid-1']//following::h2[text()='Revamp your home in style']"));
		WebElement xpathaxefollowing2=driver.findElement(By.xpath("//img[@alt='boAt']//following::span[text()='Starting ₹249 | boAt']"));
		WebElement xpathaxefollowing3=driver.findElement(By.xpath("//div[@class='a-cardui-header']//following::span[text()='Starting ₹649 | Noise']"));
	
		WebElement xpathpreceding1=driver.findElement(By.xpath("//span[text()='Lighting solutions']//preceding::a[@aria-label='Home storage']"));
		WebElement xpathpreceding2=driver.findElement(By.xpath("//span[text()='Lighting solutions']//preceding::a[@aria-label='Figurines, vases & more']"));
		WebElement xpathpreceding3=driver.findElement(By.xpath("//div[@id='desktop-grid-3']//preceding::div[@class=\"a-cardui-header\"]//h2[text()='Appliances for your home | Up to 55% off']"));
		
		WebElement xpathchild1=driver.findElement(By.xpath("//div[@class=\"a-cardui-header\"]//child::h2[text()='Appliances for your home | Up to 55% off']"));
		//WebElement xpathchild2=driver.findElement(By.xpath("//div[@id='CardInstance0VhSYGCmW9vE7jMpAGypbg']//child::div[@class='a-cardui-header']"));
		WebElement xpathchild3=driver.findElement(By.xpath("//div[@class='a-cardui-header']//child::h2[text()='Appliances for your home | Up to 55% off']"));
		
		WebElement xpathparent1=driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']//parent::div[@class='a-cardui-header']"));
		//WebElement xpathparent2=driver.findElement(By.xpath("//div[@class='a-cardui-header']//parent::div[@id='CardInstance0VhSYGCmW9vE7jMpAGypbg']"));
		WebElement xpathparent3=driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']//parent::div[@class='a-cardui-header']"));
	
	
		 WebElement xpathDescent=driver.findElement(By.xpath("//li[@class='feed-carousel-card']//descendant::img[@data-a-hires='https://m.media-amazon.com/images/I/518qYT-OjaL._AC_SY400_.jpg']"));
	
	
	}
	
	
	public void webElementCommands() {
		
		String itemToSearch="iPhone 15 Pro Max";
		WebElement mainSearchTextField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @aria-label='Search Amazon.in']"));
		mainSearchTextField.sendKeys(itemToSearch);
		
		WebElement mainSearchMagnifierIconButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
		mainSearchMagnifierIconButton.click();
		
		WebElement requiredItem=driver.findElement(By.xpath("//span[@data-component-type=\"s-search-results\"]//descendant::span[text()='Apple iPhone 15 Pro Max (256 GB) - White Titanium']"));
		String requiredSearchResult=requiredItem.getText();
		
		if(requiredSearchResult.contains(itemToSearch))
		{
			System.out.println("Item listed");
		}
	}
	
	
	
	public void navigateToTable() {
		WebElement tablescreenlink=driver.findElement(By.xpath("//ul[@class='navbar-nav']/descendant::a[@href='table-pagination.php']"));
		tablescreenlink.click();
		
	}
	
	
	public void tableHeaderMethod() {
		String expectedHeader[]= {"Name","Position","Office","Age","Start date","Salary"};
			
		ArrayList<WebElement> headerList=(ArrayList<WebElement>) driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/descendant::th"));
		int i=0;
		for(WebElement value:headerList) {
			String currentHeader=value.getText();
			if(currentHeader.equals(expectedHeader[i])) {
				i++;
			}
			else {
				System.out.println("Expected header not found!!!");
				i++;
			}
		}
	}
	
	
	public void findNameInTable(String searchName) {
		List<WebElement> nameList=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		for(WebElement name:nameList) {
			String nameText=name.getText();
			if(nameText.equals(searchName)) {
				System.out.println("Match found!!!");
				break;
			}
		}
		}
	
	public void portuguesList() {
		
		WebElement englishDropdown=driver.findElement(By.xpath("//div[@class='dropdown']/a[@role='button' and text()='English']"));
		englishDropdown.click();
		List<WebElement> languageList=driver.findElements(By.xpath("//div[@class='dropdown']/ul[@class='dropdown-menu show']/li"));
		for(WebElement language:languageList) {
			String languageName=language.getText();
			if(languageName.equals("Português (Brasileiro)")) {
				language.click();
			}
		}
	}

	public static void main(String[] args) {
		Assignments assignments=new Assignments();
		assignments.initializeBrowser();
		//assignments.navigateToTable();
		//assignments.tableHeaderMethod();
		//assignments.findNameInTable("Ashton Cox");
		assignments.portuguesList();
		assignments.driverQuit();
	}

}
