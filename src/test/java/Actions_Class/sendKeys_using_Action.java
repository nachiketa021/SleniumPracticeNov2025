package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendKeys_using_Action {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		WebElement fg=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		Actions act=new Actions(driver);
		act.sendKeys(Keys.LEFT_CONTROL).click(fg).perform();
		Thread.sleep(4500);
		driver.quit();
		
		
		

	}
}
