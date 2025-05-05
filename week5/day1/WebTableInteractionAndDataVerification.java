package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteractionAndDataVerification {

	public static void main(String[] args) {
		
		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser
		drive.manage().window().maximize();// maximize the browser
		drive.get("https://erail.in/)");// Load the Url
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		drive.findElement(By.id("txtStationFrom")).clear();//select the from station
		drive.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		drive.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		
		drive.findElement(By.id("txtStationTo")).clear(); //select the to station
		drive.findElement(By.id("txtStationTo")).sendKeys("MDU");
		drive.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		drive.findElement(By.xpath("(//input[@id='chkSelectDateOnly'])[2]")).click(); //to uncheck date sort checkbox
		
		System.out.println("Date Unchecked");
		
		drive.findElement(By.id("buttonFromTo")).click();
		
		WebElement table = drive.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		
		//List<WebElement> tableData = table.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//following::table[2]/tbody/tr/td"));
		
		List<WebElement> entireData = drive.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
		
		//for (int i = 0; i <table.size(); i++) {
			//  String text = table.get(i).getText();
			 // System.out.println("The entire data is: "+text);
		}
		
		
		
	}


