package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver drive = new EdgeDriver();// Launch Browser -ChromeBrowser
		
		drive.manage().window().maximize();// maximize the browser

		drive.get("http://leaftaps.com/opentaps/control/main");// Load the Url

		drive.findElement(By.id("username")).sendKeys("demosalesmanager"); // Enter the username in the webpage
		drive.findElement(By.id("password")).sendKeys("crmsfa");// Enter password in the webpage
		drive.findElement(By.className("decorativeSubmit")).click(); // click on Login button
		drive.findElement(By.linkText("CRM/SFA")).click();//Click on CRMSFA
		drive.findElement(By.linkText("Accounts")).click();
		drive.findElement(By.linkText("Create Account")).click();
		drive.findElement(By.id("accountName")).sendKeys("Test");
		drive.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement sourceElement1=drive.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(sourceElement1);
		dropdown1.selectByVisibleText("Computer Software");
		
		WebElement sourceElement2=drive.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(sourceElement2);
		dropdown2.selectByVisibleText("S-Corporation");
		
		WebElement sourceElement3=drive.findElement(By.name("dataSourceId"));
		Select dropdown3 = new Select(sourceElement3);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement sourceElement4=drive.findElement(By.name("marketingCampaignId"));
		Select dropdown4 = new Select(sourceElement4);
		dropdown4.deselectByIndex(6);
		
		WebElement sourceElement5=drive.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(sourceElement5);
		dropdown5.selectByValue("TX");
		
		drive.findElement(By.className("smallSubmit")).click();
		
		drive.close();
		
		
		
	}

}
