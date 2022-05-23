package my_project.my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class add_wlst {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/sofa?src=g_topnav_living_sofas-recliners_sofas']")).click();
		driver.findElement(By.xpath("//span[@data-sku='FNSF51EAGY3']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("samantasurojit842@gmail.com");
        driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("@Ss8371059433");
		driver.findElement(By.id("ul_site_login")).click();
	}

}
