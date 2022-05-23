package my_project.my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sort {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='topnav_item storageunit']"))).build().perform();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/bookshelf?src=g_topnav_storage_living-storage_bookshelves']")).click();
        a.moveToElement(driver.findElement(By.xpath("//div[@class='sort-box']"))).build().perform();
        driver.findElement(By.xpath("//li[@data-key='discount_perc_desc']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();

	}

}
