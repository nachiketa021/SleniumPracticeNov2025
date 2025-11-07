package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/p/page3.html");
		WebElement minLabel=driver.findElement(By.xpath("(//a[@class='ui-slider-handle ui-btn ui-shadow ui-btn-null'])[1]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDropBy(minLabel, 100, 0);
		act.build().perform();
		Thread.sleep(4300);
		driver.quit();
	}

}
