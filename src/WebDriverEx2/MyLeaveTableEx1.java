package WebDriverEx2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyLeaveTableEx1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement un = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		un.clear();
		un.sendKeys("user02");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		boolean bValue = driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
		if(bValue)
			System.out.println("Homepage opened");
		else
			System.out.println("Homepage not opened");
		
		Actions obj = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		obj.moveToElement(leave).build().perform();
		
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		
		
		//To get Table cell value
		String cellText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[6]")).getText();
		System.out.println("Cell text is: " + cellText);
		
		//To get row count
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Row count is: " + rowCount);
		
		//To get column count
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		int colCount = cols.size();
		System.out.println("Column count is: " + colCount);
		
		
		
		
		
		

	}

}




