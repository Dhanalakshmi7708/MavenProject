package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser
		drive.manage().window().maximize();// maximize the browser
		drive.get("https://www.facebook.com/");// Load the Url
		drive.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com "); // Enter the Email Id
		drive.findElement(By.id("pass")).sendKeys("Tuna@321"); // Enter the password
		drive.findElement(By.name("login")).click(); // Click on Login Button
		drive.findElement(By.linkText("Find your account and log in.")).click(); // Click on Forgot
		System.out.println("Title of the page" + drive.getTitle());

	}

}
