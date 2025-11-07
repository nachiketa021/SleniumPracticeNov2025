package Wait_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_Wait {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//WebElement link=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//a[contains(text(),'For')]")));
WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[contains(text(),'For')]")));
link.click();
	}

}
