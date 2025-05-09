package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseClass {

	public EdgeDriver driver; 
	
	@Parameters({"url","userName","Password"})
		@BeforeMethod
		public void preConditions(String URL, String UserName, String PassworD) {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(UserName);
			driver.findElement(By.id("password")).sendKeys(PassworD);
			driver.findElement(By.id("Login")).click();
			
		}
		
		@AfterMethod
		public void postCondition() {
			
			driver.close();		
			
		}
		
	}