
package selenium;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
*/
public class LoanchChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nwani\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://www.facebook.com");
		//System.out.println(driver.getTitle());
		
		//String actualTitle=driver.getTitle();
		String expectedTitle=("Facebook – log in or sign up");
		
		try {
			//Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Title is correct");
		} catch (Exception e) {
			
			System.out.println("Title is not marched");
		}
			
	/*
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nihal.rupasingheabc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("nihalabc123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		loginButton.click();
		*/
		
	

	}

}
