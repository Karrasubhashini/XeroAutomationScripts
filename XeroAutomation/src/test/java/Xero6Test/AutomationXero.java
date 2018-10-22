package Xero6Test;

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
	public static void tc6Login_Error_Message_Tc6() throws InterruptedException, IOException, AWTException {
		Properties pro=new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\devesh\\workspace\\SalesForceAutomation\\src\\test\\resources\\DataFiles\\XeroConfiguration.properties"));
		pro.load(reader);
		initializeExtentReport("Sprint1");
		createTestScriptReport("tc6Login_Error_Message_Tc6");
		
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
		WebElement users=driver.findElement(By.xpath("//a[@class='username']"));
		clickElement(users, "users icon clicking");
		WebElement profile=driver.findElement(By.xpath("//a[contains(text(),'Profile')]"));
		clickElement(profile, "profile icon clicking");
		WebElement upload=driver.findElement(By.xpath("//span[@id='button-1041-btnInnerEl']"));
		clickElement(upload, "upload button clicking");
		WebElement browse=driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']"));
		clickElement(browse, "browse button clicking");
		browse.sendKeys("C:\\Users\\devesh\\Pictures\\school_itin.jpg");
		WebElement upload1=driver.findElement(By.xpath(" //div[@id='button-1192-btnWrap']"));
		clickElement( upload1, "browse button clicking");
		closeDriver();
		extent.flush();
	}
	
	}

