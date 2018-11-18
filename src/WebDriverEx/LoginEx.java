package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginEx {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Admin")).click();
		
		driver.findElement(By.name("uname")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submitBtn']")).click();
		
		
		driver.quit(); 
		
	///html/body/div/div[2]/ul/li[2]/a
	
	//a[text()='Admin']
	//male[@name='Ramcharan'][@id='']
	
	
	

	}

}
