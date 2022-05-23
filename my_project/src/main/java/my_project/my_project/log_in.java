package my_project.my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class log_in {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"))).build().perform();
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("samantasurojit842@gmail.com");
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("@Ss8371059433");
		driver.findElement(By.id("ul_site_login")).click();

	}

}
