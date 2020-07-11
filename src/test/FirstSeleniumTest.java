package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstSeleniumTest {
	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {

      //Calling Methods
		setBrowser();
		setConfigBrowser();
		runTest();
		



	}

	//The using browser
	public static void setBrowser() {
		browser = "FF";
	}

	//Configure Browser Driver
	public static void setConfigBrowser() {
		//Chrome Browser
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Katalon_Studio_Windows_64-7.3.1\\Katalon_Studio_Windows_64-7.3.1\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		//FF Browser
		if(browser.contains("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\Katalon_Studio_Windows_64-7.3.1\\Katalon_Studio_Windows_64-7.3.1\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
			driver = new FirefoxDriver();


		}
	}

	public static void runTest() {

		System.out.println("Browser will open Toptal site");
		driver.get("http://www.toptal.com");
		System.out.println("Wait 5 secondes");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Title of web site is : " + driver.getTitle());
		System.out.println("Find Menu Element");
		WebElement elt = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/nav/div/ul/li[1]/a"));
		elt.click();
		//verify that we're located on page2
		WebElement elt2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/h1"));
		System.out.println("The element is located : " + elt2.getText());
		/*System.out.println("Close Driver");
		driver.close();*/

	}


}
