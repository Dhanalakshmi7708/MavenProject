package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {

	public static void main(String[] args) {

		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser
		// TODO Auto-generated method stub
		drive.get("http://leaftaps.com/opentaps/control/login");// Load the Url

		drive.manage().window().maximize();// maximize the browser

		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		drive.findElement(By.id("username")).sendKeys("DemoCSR"); // Enter the username in the webpage
		drive.findElement(By.id("password")).sendKeys("crmsfa");// Enter password in the webpage
		drive.findElement(By.className("decorativeSubmit")).click(); // click on Login button
		drive.findElement(By.linkText("CRM/SFA")).click();// Click on CRMSFA

		drive.findElement(By.linkText("Contacts")).click(); // click on contact option

		drive.findElement(By.linkText("Merge Contacts")).click(); //click on Merge contact 

		drive.findElement(By.xpath("//img[@alt='Lookup']")).click(); //click on First widget 
		
		Set<String> windowHandles = drive.getWindowHandles(); //Switch to other window 
		
		List <String> window2 = new ArrayList<String>(windowHandles);
		
		drive.switchTo().window(window2.get(1)); 
		

		drive.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); //Select the First element of the list
		
		drive.switchTo().window(window2.get(0)); //switch to old window
		

		drive.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click(); //Select the second  element of the list
		
		Set<String> windowHandles1 = drive.getWindowHandles();
		
		List <String> window3 = new ArrayList<String>(windowHandles1); //Switch to other window
		
		drive.switchTo().window(window3.get(1));
		

		drive.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		drive.switchTo().window(window3.get(0));

		drive.findElement(By.xpath("//a[@class='buttonDangerous']")).click(); //click on Merge Button

		Alert promptAlert = drive.switchTo().alert(); // to handle the prompt Alert while click on Merge 
		promptAlert.accept();

		System.out.println("Title of the page " + drive.getTitle()); //Get the title
		
		drive.close(); //close the driver/browser

	}

}
