package com.tm.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebLibrary {
	
	public static FirefoxDriver driver;
	
	//==================================================================	
		public static void launchApp(String URL)
		{
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}		
	//==================================================================		
		public static boolean clickButton(String Li_Xpath)
		{
			boolean bvalue = false;
			WebElement ele =driver.findElement(By.xpath(Li_Xpath));				
			ele.click();					
			bvalue = true;
			return bvalue;
		}		
		//==================================================================		
		public static boolean setText(String inp_xpath, String inp_Value)
		{
			WebElement fn = driver.findElement(By.xpath(inp_xpath));
			fn.clear();	
			fn.click();
			fn.sendKeys(inp_Value);
			String Act_text = fn.getAttribute("value");		
			if(Act_text.equals(inp_Value))
				return true;
			else
				return false;
		}
		//==================================================================		
		public static boolean clickLink(String Li_Xpath,String Text_value)
		{
			WebElement ele =driver.findElement(By.xpath(Li_Xpath));
			String str = ele.getText();
			System.out.println(str);
			ele.click();
			
			if(str.equals(Text_value))
				return true;
			else
				return false;
		}		
		//==================================================================		
		public static boolean selectItemwithText(String Select_id,String visible_value)
		{
			WebElement ele =driver.findElement(By.id(Select_id));
			Select sel = new Select(ele);
			sel.selectByVisibleText(visible_value);
			String str = sel.getFirstSelectedOption().getText();
			if(str.equals(visible_value))
				return true;
			else
				return false;
		}		
		//==================================================================
		
		public static boolean verifyText(String tagName,String inp_Text)
		{
			boolean bValue = driver.findElement(By.xpath("//"+tagName+"[text()='"+inp_Text+"']")).isDisplayed();
			
			if(bValue)	
				return true;	
			else		
				return false;
		}
		
		//==================================================================

}
