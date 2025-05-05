package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGAnnotations extends ProjectSpecificMethod {

	@Test
	public void LegalEntities() {

		driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button[@title='App Launcher']")).click();

		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']//input[@class='slds-input'])[2]")).sendKeys("Legal Entities");

		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		

		driver.findElement(By.xpath("//div[text()='New']")).click();

		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.name("SaveEdit")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alertext = simpleAlert.getText();
		System.out.println(alertext);

	}

}
