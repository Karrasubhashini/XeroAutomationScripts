package Xero2Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AutomationXero extends ReUsableMethodsForXero{
	@Test
	public static void Login_Error_Message_A() throws InterruptedException, IOException, AWTException {
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("Login_Error_Message_A");
		
		IntializeDriver("firefox");
		driver.get(pro.getProperty("XeroUrl"));
		logger.log(Status.INFO,"Xero page opened");
		System.out.println("Xero page opened");
		//driver.getWindowHandle();
		//driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	

		    WebElement freetrial=driver.findElement(By.xpath(" //a[@class='btn btn-primary global-ceiling-bar-btn']"));
		    clickElement(freetrial, "freetrial Button clicked");
		    WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		    enterText(firstname, "Enter name  field","subhashini");
		    WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
		    enterText(lastname, "Enter name last name  field","k");
		    WebElement emailid=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		    enterText(emailid, "Enter emil id  field","subhashinigangula5@gmail.com");
		    WebElement phonenum=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		    enterText(phonenum, "Enter phone number field","9549881234");
		    WebElement location=driver.findElement(By.xpath("//select[@name='LocationCode']"));
		    clickElement( location, "location field");
		    WebElement checkmark=driver.findElement(By.className("recaptcha-checkbox-checkmark"));
		    clickElement( checkmark, "robot box  click checked");
		
		WebElement conditions=driver.findElement(By.xpath("//input[@value='true']"));
		 clickElement( conditions, "terms and conditions  clicked ");
		 WebElement getstarted=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		 clickElement( getstarted, "getstarted button  clicked ");
		closeDriver();
		extent.flush();
	}
	@Test
public static void tC2Login_Error_Message_B() throws InterruptedException, IOException, AWTException{
	Properties pro=new Properties();
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
	pro.load(reader);
	initializeExtentReport("Sprint1");
	createTestScriptReport("Login_Error_Message_B");
	
	IntializeDriver("firefox");
	driver.get(pro.getProperty("XeroUrl"));
	logger.log(Status.INFO,"Xero page opened");
	System.out.println("Xero page opened");
	//driver.getWindowHandle();
	//driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

	Robot robot = new Robot();  // Robot class throws AWT Exception	
    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
    robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
    
    Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_ENTER);	

    WebElement freetrial=driver.findElement(By.xpath(" //a[@class='btn btn-primary global-ceiling-bar-btn']"));
    clickElement(freetrial, "freetrial Button clicked");
    WebElement getstarted=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
	 clickElement( getstarted, "getstarted button  clicked ");
	System.out.println("get started button clicked");
	WebElement mailid=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
	enterText(mailid, "Enter emil id  field","subhashinigangula@gmail.com");
	
	 WebElement getstarted1=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
	 clickElement( getstarted1, "getstarted button  clicked ");
	 logger.log(Status.INFO,"terms and conditions should be highlighted");
	closeDriver();
	extent.flush();
	
}
	@Test
public static void tC2Login_Error_Message_C() throws InterruptedException, IOException, AWTException{
	Properties pro=new Properties();
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
	pro.load(reader);
	initializeExtentReport("Sprint1");
	createTestScriptReport("Login_Error_Message_C");
	
	IntializeDriver("firefox");
	driver.get(pro.getProperty("XeroUrl"));
	logger.log(Status.INFO,"Xero page opened");
	System.out.println("Xero page opened");
	//driver.getWindowHandle();
	//driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

	Robot robot = new Robot();  // Robot class throws AWT Exception	
    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
    robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
    
    Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_ENTER);	

	    
    WebElement freetrial=driver.findElement(By.xpath(" //a[@class='btn btn-primary global-ceiling-bar-btn']"));
    clickElement(freetrial, "freetrial Button clicked");
	System.out.println("free trail icon clicked");
	WebElement termsofuse=driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
	clickElement(termsofuse, "terms of use link clicked");
	WebElement privacypolocy=driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
	clickElement(privacypolocy, "privacypolocy link clicked");
	closeDriver();
	extent.flush();
}
	@Test
	public static void tC2Login_Error_Message_D() throws InterruptedException, IOException, AWTException{
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("Login_Error_Message_4");
		
		IntializeDriver("firefox");
		driver.get(pro.getProperty("XeroUrl"));
		logger.log(Status.INFO,"Xero page opened");
		System.out.println("Xero page opened");
		//driver.getWindowHandle();
		//driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		Robot robot = new Robot();  // Robot class throws AWT Exception	
	    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
	    robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
	    
	    Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_ENTER);	

		    
	    WebElement freetrial=driver.findElement(By.xpath(" //a[@class='btn btn-primary global-ceiling-bar-btn']"));
	    clickElement(freetrial, "freetrial Button clicked");
		System.out.println("free trial icon clicked");
		

		
		driver.close();
		extent.flush();
	}
	@Test
	public static void tC2Login_Error_Message_E() throws InterruptedException, IOException, AWTException{
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("Login_Error_Message_E");
		
		IntializeDriver("firefox");
		driver.get(pro.getProperty("XeroUrl"));
		logger.log(Status.INFO,"Xero page opened");
		System.out.println("Xero page opened");
		//driver.getWindowHandle();
		//driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		Robot robot = new Robot();  // Robot class throws AWT Exception	
	    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
	    robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
	    
	    Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_ENTER);	

		    
	    WebElement freetrial=driver.findElement(By.xpath(" //a[@class='btn btn-primary global-ceiling-bar-btn']"));
	    clickElement(freetrial, "freetrial Button clicked");
		System.out.println("free trial icon clicked");
		WebElement account=driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		clickElement( account, "account and bookkeeper icon clicked");
		

		
		driver.close();
		extent.flush();
	}
}
