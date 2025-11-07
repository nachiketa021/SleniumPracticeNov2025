package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hod_Release {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
WebElement fgpwd=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
Actions act=new Actions(driver);
Thread.sleep(2000);
act.clickAndHold();
Thread.sleep(4000);
act.release(fgpwd).build().perform();
Thread.sleep(4000);
driver.quit();

	}

}
