package WebDriverEx2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerEx {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();		
		
		//Move mouse to Leave menu
		Actions obj = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		obj.moveToElement(leave).build().perform();
		//Click Apply
		driver.findElement(By.id("menu_leave_applyLeave")).click();

		
		driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();		
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[9]")).click();
		
		driver.findElement(By.xpath("//a[text()='26']")).click();
		
		
		
		
		
		
	}

}
