package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver drive = new EdgeDriver();// Launch Browser -ChromeBrowser
		// TODO Auto-generated method stub
		drive.get("https://www.ajio.com/");// Load the Url

		drive.manage().window().maximize();// maximize the browser

		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(5000);
		
		System.out.println("Ajio WebPage Launched");
		
		drive.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags"); 
		drive.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		drive.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		drive.findElement(By.id("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		WebElement searchResult = drive.findElement(By.xpath("//div[@class='length']"));
		String itemCount = searchResult.getText();
		System.out.println("Numbe rof Matches is "+itemCount );
		
		
		
		List<WebElement> brandList = drive.findElements(By.className("brand"));
		System.out.println("Listed Brand Names are "+ brandList);
		
		List<WebElement> bagList = drive.findElements(By.className("nameCls"));
		System.out.println("Listed Brand Names are "+ bagList);
		
				
	}

}
