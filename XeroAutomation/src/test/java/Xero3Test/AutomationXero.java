package Xero3Test;

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
	public static void tc3Login_Error_Message_Tc3() throws InterruptedException, IOException, AWTException {
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("tc3Login_Error_Message_Tc3");
		
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
		WebElement dashboard=driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
		clickElement(dashboard, "dashboard icon clicked");
		WebElement accounts=driver.findElement(By.xpath("//body[@class='center xeroV2 bridge ext-chrome x-sandbox']/div[@id='header']/div/div[@id='xero-nav']/div[@class='xn-l-header xn-s-blue-header']/div[@class='xn-l-nav-info']/div[@class='xn-h-header-tabs']/ul/li[@class='xn-h-menu open']/a[1]"));
		clickElement(accounts, "accounts icon clicked");
		WebElement reports=driver.findElement(By.xpath("//li[@class='xn-h-menu report_favorites']"));
		clickElement(reports, "reports icon clicked");
		WebElement contacts=driver.findElement(By.xpath("//body[@class='center xeroV2 bridge ext-chrome x-sandbox']/div[@id='header']/div/div[@id='xero-nav']/div[@class='xn-l-header xn-s-blue-header']/div[@class='xn-l-nav-info']/div[@class='xn-h-header-tabs']/ul/li[6]/a[1]"));
		clickElement(contacts, "contacts icon clicked");
		WebElement settings=driver.findElement(By.xpath("//body[@class='center xeroV2 bridge ext-chrome x-sandbox']/div[@id='header']/div/div[@id='xero-nav']/div[@class='xn-l-header xn-s-blue-header']/div[@class='xn-l-nav-info']/div[@class='xn-h-header-tabs']/ul/li[7]/a[1]"));
		clickElement(settings, "contacts icon clicked");
		WebElement plusicon=driver.findElement(By.xpath("//a[@id='quicklaunchTab']"));
		clickElement(plusicon, "plus icon clicked");
		WebElement files=driver.findElement(By.xpath("//a[@class='files']"));
		clickElement(files, "files icon clicked");
		WebElement notifications=driver.findElement(By.xpath("//a[@class='notifications x-sandbox']"));
		clickElement(notifications, "notifications icon clicked");
		WebElement search=driver.findElement(By.xpath("//a[@class='search']"));
		clickElement( search, " search icon clicked");
		WebElement help=driver.findElement(By.xpath("//a[@class='help']"));
		clickElement( help, " help icon clicked");
		
		closeDriver();
		extent.flush();
	}
	
	}

