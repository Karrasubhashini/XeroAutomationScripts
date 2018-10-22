package XeroTest;

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
	public static void Login_Error_Message_1() throws InterruptedException, IOException, AWTException {
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("Login_Error_Message_1");
		
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
		closeDriver();
		
	}
	@Test
public static void tC2Login_Error_Message_2() throws InterruptedException, IOException, AWTException{
	Properties pro=new Properties();
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
	pro.load(reader);
	initializeExtentReport("Sprint1");
	createTestScriptReport("Login_Error_Message_2");
	
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

	    
	WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
	//WebElement login=driver.findElement(By.xpath("body[@id='login']"));
	clickElement(login, "login Button");
	System.out.println("login button clicked");
	

	WebElement username=driver.findElement(By.id(" //input[@id='email']"));
	enterText(username, "username field","subhashinigangula5@gmail.com");
	WebElement password=driver.findElement(By.xpath(" //input[@id='password']"));
	enterText(password, "password field","subhashini");
	//logger.log(Status.INFO,"subhashini86");
	WebElement loginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
	clickElement(loginButton, "submit Button");
	logger.log(Status.INFO,"check your password");
	closeDriver();
	
}
	@Test
public static void tC3Login_Error_Message_3() throws InterruptedException, IOException, AWTException{
	Properties pro=new Properties();
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
	pro.load(reader);
	initializeExtentReport("Sprint1");
	createTestScriptReport("Login_Error_Message_3");
	
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

	    
	WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
	//WebElement login=driver.findElement(By.xpath("body[@id='login']"));
	clickElement(login, "login Button");
	System.out.println("login button clicked");
	

	WebElement username=driver.findElement(By.id(" //input[@id='email']"));
	enterText(username, "username field","subhashinigangula@gmail.com");
	WebElement password=driver.findElement(By.xpath(" //input[@id='password']"));
	enterText(password, "password field","subhashini@86");
	//logger.log(Status.INFO,"subhashini86");
	WebElement loginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
	clickElement(loginButton, "submit Button");
	logger.log(Status.INFO,"check your mail id ,enter correct password");
	closeDriver();
}
	@Test
	public static void tC4Login_Error_Message_4() throws InterruptedException, IOException, AWTException{
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

		    
		WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		//WebElement login=driver.findElement(By.xpath("body[@id='login']"));
		clickElement(login, "login Button");
		System.out.println("login button clicked");
		

		WebElement username=driver.findElement(By.id(" //input[@id='email']"));
		enterText(username, "username field","subhashinigangula@gmail.com");
		WebElement forgotpassword=driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		clickElement(forgotpassword, "forgotpassword clicked");
		logger.log(Status.INFO,"Reset password page opened");
		driver.close();
	}
}
