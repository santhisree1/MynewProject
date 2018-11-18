package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		String str = driver.getTitle();
		System.out.println(str);
		
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		String s1 = driver.findElement(By.id("txtUsername")).getTagName();
		System.out.println(s1);
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		driver.close();
		

	}

}
