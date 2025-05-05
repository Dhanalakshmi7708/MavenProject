package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	public EdgeDriver driver; 
		
		@BeforeMethod
		public void preConditions() {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("vinothkumar.sanmugaraj848@agentforce.com");
			driver.findElement(By.id("password")).sendKeys("Sales@123");
			driver.findElement(By.id("Login")).click();
			
		}
		
		@AfterMethod
		public void postCondition() {
			
			driver.close();		
			
		}
		
	}




