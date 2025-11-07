package interview_only_sel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Up_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2100);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)");
		}
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,-1000)");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
