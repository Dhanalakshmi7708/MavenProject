package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser
		drive.manage().window().maximize();// maximize the browser
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // wait applied to load the browser
		drive.get("https://en-gb.facebook.com/");// Load the Url
		drive.findElement(By.linkText("Create new account")).click(); // click on create account
		drive.findElement(By.name("firstname")).sendKeys("Test"); // enter value for first name
		drive.findElement(By.name("lastname")).sendKeys("Leaf"); // enter value for last name
		WebElement sourceElement = drive.findElement(By.id("day")); // select class for day drop-down
		Select dropdown1 = new Select(sourceElement);
		dropdown1.selectByVisibleText("29");
		
		WebElement sourceElement1 = drive.findElement(By.id("month")); // select class for month drop-down
		Select dropdown2 = new Select(sourceElement1);
		dropdown2.selectByVisibleText("May");
		
		WebElement sourceElement2 = drive.findElement(By.id("year"));// select class for year drop-down
		Select dropdown3 = new Select(sourceElement2);
		dropdown3.selectByVisibleText("1992");
		
		drive.findElement(By.xpath("(//input[@name='sex'])[2]")).click(); //used xpath with index to click on gender radio button
		
		drive.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");//enter the email address
		drive.findElement(By.name("reg_passwd__")).sendKeys("DDD@123"); //enter the password
		drive.findElement(By.linkText("Sign Up")).click(); //click on create button 
		System.out.println("Code executed and Signup successfully");

		 

	}

}
