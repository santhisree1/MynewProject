package WebDriverEx;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleEx {

public static void main(String[] args) {
		
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	String ExpTitle = "Google"; 
	String ActTitle = driver.getTitle();
	if(ExpTitle.equals(ActTitle))
		System.out.println("pass");
	else
		System.out.println("Fail");
	
	} 

}
