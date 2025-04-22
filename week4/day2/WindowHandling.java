package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver drive = new ChromeDriver();
		
		drive.manage().window().maximize();// maximize the browser
		
		drive.get("https://www.irctc.co.in/");// Load the Url
		
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		drive.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		
		Set<String> allWindows = drive.getWindowHandles();
		List<String> alladdress= new ArrayList<String>(allWindows);
		drive.switchTo().window(alladdress.get(1));
		
		String titleofChildPage = drive.getTitle();
		System.out.println("Title of child page is  "+ titleofChildPage);
		
		drive.switchTo().window(alladdress.get(0));
		drive.close();
		

	}

}
