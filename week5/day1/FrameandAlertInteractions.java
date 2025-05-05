package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlertInteractions {

	public static void main(String[] args) {

		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser

		drive.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");// Load the Url

		drive.manage().window().maximize();// maximize the browser

		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement frame1 = drive.findElement(By.id("iframeResult")); // find the element and stored in web element
		drive.switchTo().frame(frame1); //switch to frame

		drive.findElement(By.xpath("//button[text()='Try it']")).click(); //click on Try it button

		Alert simpleAlert = drive.switchTo().alert(); //transfer driver focus to Alert box

		String alertmessage = simpleAlert.getText(); // get the text from alert box

		System.out.println("Message displayed on Alert - " + alertmessage); //printing the text appeared in alert box

		simpleAlert.accept(); // click on ok button 

	}

}