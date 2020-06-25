package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumUsingTestNG {
	public WebDriver driver;

	@BeforeTest
	public void setProperties() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nwani\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle = ("Facebook – log in or sign up");
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0)
	public void loginToFacebook() {

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nihal.rupasingheabc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("nihalabc123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		loginButton.click();

	}

	@Test(priority = 1)
	public void searchProfile() {

		WebDriverWait wait = new WebDriverWait(driver,30);
		Alert alert =wait.until(ExpectedConditions.alertIsPresent());

		//Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		// driver.switchTo().alert().dismiss();
		WebElement searchBox = driver.findElement(By.xpath("//div[@id='u_a_2']//input[@placeholder='Search']"));
		searchBox.sendKeys("Muthumuni Amila Priyadarshana Silwa");
		WebElement searchButton = driver.findElement(By.xpath("//i[@class='_585_']"));
		searchButton.click();

	}

	/*
	 * @AfterTest public void endSession() { driver.quit();
	 * 
	 * }
	 */
	//add comment changes to check git function
}
