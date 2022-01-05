package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumbaseprogram {

	public static void main(String[] args) {
	
//setup the driver
		WebDriverManager.chromedriver().setup();
		
//launch the driver
		ChromeDriver driver = new ChromeDriver();
//Load the driver
		
		driver.get("http://leaftaps.com/opentaps/");
//Maximise the browser
		
	driver.manage().window().maximize();
//Get the title
	
	String title = driver.getTitle();
System.out.println(title);
	
	
	}

}
