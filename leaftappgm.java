package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftappgm {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Thread.sleep(3000, 0);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Thilakavathi");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Sampath");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Thilakavathi");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Sampath");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("HRSS");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("HR Shared services");
		//driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendkeys("thilaka08@gmail.com");
		WebElement name = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select country = new Select(name);
		country.selectByVisibleText("United States");
		WebElement cc = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(cc);
		state.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("update the description");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	
		
		
		
		

	}

}
