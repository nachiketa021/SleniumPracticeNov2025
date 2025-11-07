package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Op {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement use = driver.findElement(By.xpath("//a[@id='demo-tab-use']"));
		WebElement frm = driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]"));
		Actions act = new Actions(driver);
		for (int i = 1; i <= 3; i++) {
			Thread.sleep(1001);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
		}
		act.moveToElement(use).perform();
		Thread.sleep(3000);
		act.moveToElement(frm).click();
		act.build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
