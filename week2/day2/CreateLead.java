package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser
		
		drive.manage().window().maximize();// maximize the browser

		drive.get("http://leaftaps.com/opentaps/control/main");// Load the Url

		drive.findElement(By.id("username")).sendKeys("demosalesmanager"); // Enter the username in the webpage
		drive.findElement(By.id("password")).sendKeys("crmsfa");// Enter password in the webpage
		drive.findElement(By.className("decorativeSubmit")).click(); // click on Login button
		drive.findElement(By.linkText("CRM/SFA")).click();//Click on CRMSFA
		drive.findElement(By.linkText("Leads")).click();//Click on the Leads link
		drive.findElement(By.linkText("Create Lead")).click();//Click on the Create Lead
		drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");//Enter the company name
		drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Test123");//Enter the first name
		drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Test234");//Enter the last name
		drive.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");//Enter the Title
		
		drive.findElement(By.name("submitButton")).click();//click on Submit button to create Lead
		System.out.println("Title of the page" + drive.getTitle());//get the title 
		drive.close();
		System.out.println("Lead Creation Done");
		
		
		
	}

}
