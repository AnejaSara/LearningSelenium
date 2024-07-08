package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadClass extends Base {
	
	
	public void fileUploadUsingSendkeys() {
		WebElement uploadButton=driver.findElement(By.xpath("//input[@class='upload_txt' and @name='uploadfile_0']"));
		uploadButton.sendKeys("D:\\Upload Files\\SeleniumSelfNotes.pdf");
	}
	
	public void fileUploadUsingRobotClass() throws AWTException {
		WebElement uploadPdfButton=driver.findElement(By.xpath("//div[@class=\"uploader\"]/a[@id=\"pickfiles\"]"));
		uploadPdfButton.click();
		
		StringSelection ss = new StringSelection("D:\\Upload Files\\SeleniumSelfNotes.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //path is saved to clipboard
		Robot robot = new Robot(); // to handle keyboard
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER); // to press enter key
		robot.keyRelease(KeyEvent.VK_ENTER); // to release enter 
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

	public static void main(String[] args) {
		FileUploadClass fileuploadclass=new FileUploadClass();
		fileuploadclass.initializeBrowser();
		try {
			fileuploadclass.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileuploadclass.fileUploadUsingSendkeys();
		fileuploadclass.driverQuit();

	}

}
