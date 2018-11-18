package WebDriverEx2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplyLeaveAndCancel {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		//leaveType.selectByVisibleText("Personal Leave");
		
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[3]")).click();
		String leaveDate = "2018-09-28";
		driver.findElement(By.id("applyleave_txtFromDate")).clear();
		driver.findElement(By.id("applyleave_txtFromDate")).sendKeys(leaveDate);
		driver.findElement(By.id("applyleave_txtToDate")).clear();
		driver.findElement(By.id("applyleave_txtToDate")).sendKeys(leaveDate);
		
		driver.findElement(By.id("applyleave_txtComment")).sendKeys("test1");
		
		driver.findElement(By.id("applyBtn")).click();
		
		Thread.sleep(3000);		
			
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowCount = rows.size();
		
		for(int i=1; i<=rowCount; i++)
		{
			String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			String appStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			if(appDate.equals(leaveDate) && (appStatus.contains("Pending Approval")))				
			{
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[8]/select/option[2]")).click();
				driver.findElement(By.id("btnSave")).click();
			}
		}
		
		
		
		

	}

}
