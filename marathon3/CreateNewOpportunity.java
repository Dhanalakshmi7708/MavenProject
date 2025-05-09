package marathon3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 class CreateNewOpportunity extends baseClass {
	
	@DataProvider(name="fetchData")
	public String [][] sendData() throws IOException{
		
		String[][] readData=ReadExcel1.readData();
		return readData;
		}
	

@Test(dataProvider = "fetchData" )

public void runCreateOpporunity(String OpporuntityName) {

// Click on toggle menu button
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

//  Click view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();

//  Click Sales from App Launcher		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

// Click on Opportunity tab 		
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);

// Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();

// Enter Opportunity name & Store it
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]"));
		oppName.sendKeys(OpporuntityName);

// Choose close date as Today
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[3]/td[7]")).click();
		// driver.findElement(By.xpath("//label[text()='Close
		// Date']/following::input[1]")).sendKeys("{{today}}");
// Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("//label[text()='Stage']/following::button")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();

// click Save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

// VerifyOppurtunity Name		
		String verifymsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a"))
				.getAttribute("title");
				

		if (verifymsg.contains(OpporuntityName)) {
			System.out.println("New Oppurtunity Created");
		} else {
			System.out.println("Oppurtunity not Created");
		}
	}
}
	

