package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseAndQuitWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Katalon_Studio_Windows_64-7.3.1\\Katalon_Studio_Windows_64-7.3.1\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://www.popuptest.com/popuptest2.html");
		driver.navigate().to("http://www.facebook.com");
		
         /**
          * Implicit wait		
          */
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.navigate().forward();
		//driver.navigate().back();

		/**
         * Explicit wait for elt to be visible		
         */
		WebDriverWait ExpliciWait = new WebDriverWait(driver,10);
		ExpliciWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/h1/a/i")));
		//Thread.sleep(5000);
		//driver.close();

	}

}
