package interview_only_sel;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait_Adv_Ver_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		for(int i=1;i<=2;i++)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(100,0)");
		}
		WebElement dd=driver.findElement(By.xpath("//div[@class='dropdown']"));
		dd.click();
		for(int i=1;i<=2;i++)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,150)");
		}
		//driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(1))
			       .ignoring(NoSuchElementException.class);

			   WebElement foob = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
			     }
			   });
			   JavascriptExecutor jd=(JavascriptExecutor)driver;
			   jd.executeScript("arguments[0].click()",foob);
			   
			   Thread.sleep(3000);
			   driver.quit();
	}
}


