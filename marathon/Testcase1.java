package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser

		drive.get("https://www.pvrcinemas.com/");// Load the Url

		drive.manage().window().maximize();// maximize the browser

		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(5000);

		drive.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		drive.findElement(By.xpath("(//h6[@class='cities-name pointer'])[6]")).click();

		drive.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();// Click on cinema under Quick Book
		drive.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();// Select
																												// the
																												// Cinema
																												// Dropdown
		drive.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();// Select the location from dropdow

		// drive.findElement(By.xpath("//div[@id='date']")).click(); //select data
		// dropdown
		drive.findElement(By.xpath("//li[@class='p-dropdown-item']//span[contains(text(),'Tomorrow')]")).click();

		System.out.println("Date Selected Successfully");
		// drive.findElement(By.xpath("//span[contains(text(),'Select
		// Movie')]")).click();
		drive.findElement(By.xpath("(//span[text()='GOOD BAD UGLY'])[2]")).click();

		System.out.println("Movie Selected Successfully");

		// drive.findElement(By.xpath("//span[contains(text(),'Select
		// Timing')]")).click();
		drive.findElement(By.xpath("//span[contains(text(),'12:25')]")).click();

		System.out.println("Time Selected");

		drive.findElement(By.xpath("(//span[text()='Book'])[5]")).click();

		drive.findElement(By.xpath("//button[text()='Accept']")).click();

		drive.findElement(By.xpath("(//span[@class='seat-current-pvr'])[4]")).click();
		drive.findElement(By.xpath("//button[text()='Proceed']")).click();

		String SeatNumber = drive.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("SeatNumber Selected " + SeatNumber);

		String grandTotal = drive.findElement(By.xpath("//div[@class='grand-amount']")).getText();
		System.out.println(grandTotal);

		drive.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();

		drive.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();

		System.out.println("Title of the page " + drive.getTitle());

		drive.close();

	}

}
