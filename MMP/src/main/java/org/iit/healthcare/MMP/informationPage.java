package org.iit.healthcare.MMP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class informationPage{
	
	WebDriver driver;
	HelperClass helperObj;
		 
		  WebElement informationText = driver.findElement(By.xpath("//div[@class='panel-title']");
		  
		 String expected = "Manage My Patient (MMP) is a medical practice management"
					+ " solution that boosts productivity by automating the day-to-day "
				+ "tasks that can slow an office manager down. Central delivers much"
					+ " more than medical billing software. Sure, it has the tools to "
					+ "help generate cleaner claims and reduce denials, but our "
					+ "easy-to-use practice management software also streamlines "
					+ "your workflow to deliver seamless handoffs across departments. "
			        + "Manage My Patient (MMP) becomes your practice’s command center, "
					+ "delivering robust, real-time analytics through customizable reports and"
					+ " dashboards to ensure you know how your business is performing on the metrics that matter most.";
		 
		 
		 String actual = "Manage My Patient (MMP) is a medical practice management"
					+ " solution that boosts productivity by automating the day-to-day "
				+ "tasks that can slow an office manager down. Central delivers much"
					+ " more than medical billing software. Sure, it has the tools to "
					+ "help generate cleaner claims and reduce denials, but our "
					+ "easy-to-use practice management software also streamlines "
					+ "your workflow to deliver seamless handoffs across departments. "
			        + "Manage My Patient (MMP) becomes your practice’s command center, "
					+ "delivering robust, real-time analytics through customizable reports and"
					+ " dashboards to ensure you know how your business is performing on the metrics that matter most.";
		 
		 
		 public  informationPage(WebDriver driver){
				this.driver = driver;
				helperObj = new HelperClass(driver);
				
				public boolean validateInformation()
				{
					boolean result = true;
					String actualText = "";
					String[] expectedList = expected.split(" ");
					actual = (driver.findElement(actualText).getText()).trim();
					String[] textList = actual.split("\n");
					System.out.println(textList.length);
					for (int i=0;i<textList.length; i++) {
						textList[i] = textList[i].trim();
						if (!(textList[i].isEmpty())){
							actualText = actualText+" "+textList[i];
						}
				
		 
	} 
					System.out.println(actualText);
					actualText = actualText.trim();
					String[] actualList = actualText.split(" ");
					result = Arrays.equals(expectedList, actualList);
					System.out.println(result);
					
					return result;
}