package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class facebookpgm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(3);
		driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		//WebElement name = new.
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thilaka");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sampath");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sthilak82@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sthilak82@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("welcome2021");
		WebElement id = driver.findElement(By.id("day"));
		Select date = new Select (id);
		date.selectByValue("13");
		WebElement mm = driver.findElement(By.id("month"));
		Select dat = new Select (mm);
		dat.selectByVisibleText("Dec");		
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select (year);
		yr.selectByVisibleText("1982");
		driver.findElement(By.xpath("//label[text()='Female']/following :: input")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
		
		

	}

}
