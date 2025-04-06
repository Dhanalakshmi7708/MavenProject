package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser
		
		drive.get("https://www.facebook.com/");//Load the Url
		
		drive.manage().window().maximize();//maximize the browser 
		
	}

}
