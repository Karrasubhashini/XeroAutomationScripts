package Xero8Test;

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

import Xero3Test.ReUsableMethodsForXero;

import com.aventstack.extentreports.Status;

public class AutomationXero extends ReUsableMethodsForXero{
	@Test
	public static void tc8Login_Error_Message_Tc8A() throws InterruptedException, IOException, AWTException {
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("tc8Login_Error_Message_Tc8");
		
		IntializeDriver("firefox");
		driver.get(pro.getProperty("XeroUrl"));
		logger.log(Status.INFO,"Xero page opened");
		System.out.println("Xero page opened");
		takeScreenShot();
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

        WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		//WebElement login=driver.findElement(By.xpath("body[@id='login']"));
		clickElement(login, "login Button");
		System.out.println("login button clicked");
		

		WebElement username=driver.findElement(By.id(" //input[@id='email']"));
		enterText(username, "username field","subhashinigangula5@gmail.com");
		WebElement password=driver.findElement(By.xpath(" //input[@id='password']"));
		enterText(password, "password field","subhashini@86");
		//logger.log(Status.INFO,"subhashini86");
		WebElement loginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickElement(loginButton, "submit Button");
		logger.log(Status.INFO,"submit button clicked");
		WebElement myxero=driver.findElement(By.xpath("//h2[@class='org-name']"));
		clickElement(myxero, "MyXero icon clicked");
		WebElement myxeroclick=driver.findElement(By.xpath("//a[@class='myxero-link']"));
		clickElement( myxeroclick, "MyXeroclic icon clicked");
		WebElement addorganization=driver.findElement(By.xpath("//a[@id='ext-gen1042']"));
		clickElement( addorganization, "addorganization button clicked");
		WebElement organizationname=driver.findElement(By.xpath("//div[@id='container-1020']"));
		enterText(organizationname, "organizationnamename field","abc");
		WebElement dropdown=driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']"));
		dropdown.isSelected();
		WebElement timezone=driver.findElement(By.xpath("rel XPath //div[@id='ext-gen1100']"));
		enterText(timezone, "timezone field","pst time");
		WebElement organization=driver.findElement(By.xpath(" //input[@id='industrysearchcombofield-1025-inputEl']"));
		enterText( organization, " organization field","business");
		WebElement starttrial=driver.findElement(By.xpath("//a[@id='simplebutton-1035']"));
		clickElement( starttrial, "starttrial button clicked");
		closeDriver();
	}
	@Test
	public static void tc8Login_Error_Message_Tc8B() throws IOException, AWTException, InterruptedException{
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("tc8Login_Error_Message_Tc8");
		
		IntializeDriver("firefox");
		driver.get(pro.getProperty("XeroUrl"));
		logger.log(Status.INFO,"Xero page opened");
		System.out.println("Xero page opened");
		takeScreenShot();
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

        WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		//WebElement login=driver.findElement(By.xpath("body[@id='login']"));
		clickElement(login, "login Button");
		System.out.println("login button clicked");
		

		WebElement username=driver.findElement(By.id(" //input[@id='email']"));
		enterText(username, "username field","subhashinigangula5@gmail.com");
		WebElement password=driver.findElement(By.xpath(" //input[@id='password']"));
		enterText(password, "password field","subhashini@86");
		//logger.log(Status.INFO,"subhashini86");
		WebElement loginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickElement(loginButton, "submit Button");
		logger.log(Status.INFO,"submit button clicked");
		WebElement myxero=driver.findElement(By.xpath("//h2[@class='org-name']"));
		clickElement(myxero, "MyXero icon clicked");
		WebElement myxeroclick=driver.findElement(By.xpath("//a[@class='myxero-link']"));
		clickElement( myxeroclick, "MyXeroclic icon clicked");
		WebElement addorganization=driver.findElement(By.xpath("//a[@id='ext-gen1042']"));
		clickElement( addorganization, "addorganization button clicked");
		WebElement organizationname=driver.findElement(By.xpath("//div[@id='container-1020']"));
		enterText(organizationname, "organizationnamename field","abc");
		WebElement dropdown=driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']"));
		dropdown.isSelected();
		WebElement timezone=driver.findElement(By.xpath("rel XPath //div[@id='ext-gen1100']"));
		enterText(timezone, "timezone field","pst time");
		WebElement organization=driver.findElement(By.xpath(" //input[@id='industrysearchcombofield-1025-inputEl']"));
		enterText( organization, " organization field","business");
		WebElement starttrial=driver.findElement(By.xpath("//a[@id='simplebutton-1035']"));
		clickElement( starttrial, "starttrial button clicked");
		closeDriver();
	}
	@Test
	public static void tc8Login_Error_Message_Tc8C(){
		createTestScriptReport("tc8Login_Error_Message_Tc8");
		logger.log(Status.INFO,"more organization added");
	}
	@Test
	public static void tc8Login_Error_Message_Tc8F() throws IOException, AWTException, InterruptedException{
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("tc8Login_Error_Message_Tc8");
		
		IntializeDriver("firefox");
		driver.get(pro.getProperty("XeroUrl"));
		logger.log(Status.INFO,"Xero page opened");
		System.out.println("Xero page opened");
		takeScreenShot();
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

        WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		//WebElement login=driver.findElement(By.xpath("body[@id='login']"));
		clickElement(login, "login Button");
		System.out.println("login button clicked");
		

		WebElement username=driver.findElement(By.id(" //input[@id='email']"));
		enterText(username, "username field","subhashinigangula5@gmail.com");
		WebElement password=driver.findElement(By.xpath(" //input[@id='password']"));
		enterText(password, "password field","subhashini@86");
		//logger.log(Status.INFO,"subhashini86");
		WebElement loginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickElement(loginButton, "submit Button");
		logger.log(Status.INFO,"submit button clicked");
		WebElement myxero=driver.findElement(By.xpath("//h2[@class='org-name']"));
		clickElement(myxero, "MyXero icon clicked");
		WebElement myxeroclick=driver.findElement(By.xpath("//a[@class='myxero-link']"));
		clickElement( myxeroclick, "MyXeroclic icon clicked");
		WebElement addorganization=driver.findElement(By.xpath("//a[@id='ext-gen1042']"));
		clickElement( addorganization, "addorganization button clicked");
		WebElement organizationname=driver.findElement(By.xpath("//div[@id='container-1020']"));
		enterText(organizationname, "organizationnamename field","abc");
		WebElement dropdown=driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']"));
		dropdown.isSelected();
		WebElement timezone=driver.findElement(By.xpath("rel XPath //div[@id='ext-gen1100']"));
		enterText(timezone, "timezone field","pst time");
		WebElement organization=driver.findElement(By.xpath(" //input[@id='industrysearchcombofield-1025-inputEl']"));
		enterText( organization, " organization field","business");
		WebElement buynow=driver.findElement(By.xpath("//a[@id='simplebutton-1036']"));
		clickElement( buynow, "buynow button clicked");
		WebElement quickbooks=driver.findElement(By.xpath("//a[@id='conversionLink']"));
		clickElement(quickbooks, "quickbooks clicked");
		closeDriver();
		extent.flush();
	}
	}
	

