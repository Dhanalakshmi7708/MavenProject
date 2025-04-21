package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver drive = new ChromeDriver();// Launch Browser -ChromeBrowser

		drive.get("https://www.amazon.in/");// Load the Url

		drive.manage().window().maximize();// maximize the browser

		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(5000);

		System.out.println("Amazon Browser Launched");

		drive.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])")).sendKeys("Bags for boys");
		drive.findElement(By.id("nav-search-submit-button")).click();
		String match = drive
				.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"))
				.getText();
		System.out.println("Number of Matches found for your search: " + match);

		drive.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		drive.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]")).click();

		//// *[@id="p_123/2037"]/span/a/span

		drive.findElement(By.xpath("//span[text()='Last 30 days']")).click();

		String bagDetails = drive
				.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']"))
				.getText();
		System.out.println("BagDetails:  " + bagDetails);

		System.out.println("Title of the page:  " + drive.getTitle());

		drive.close();

	}

}
