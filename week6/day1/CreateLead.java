package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@DataProvider(name="fetchData")
	public String[][] sendData(){
		
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Test123";
		data[0][2]="XYZ";
		
		data[1][0]="Qeagle";
		data[1][1]="123test";
		data[1][2]="XYZ";
		return data;
			
	}	
	@Test (dataProvider = "fetchData")
	public void runCreateLead(String companyName,String firstName,String lastName) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
		driver.findElement(By.name("submitButton")).click();
		
	}

}
