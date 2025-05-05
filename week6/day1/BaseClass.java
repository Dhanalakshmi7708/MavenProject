package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public EdgeDriver driver; 
		
	@Parameters({"url","userName","Password"})
		@BeforeMethod
		public void preConditions(String url, String userName, String Password) {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("url");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("userName");
			driver.findElement(By.id("password")).sendKeys("Password");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			
		}
		
		@AfterMethod
		public void postCondition() {
			
			driver.close();		
			
		}
		
	}




