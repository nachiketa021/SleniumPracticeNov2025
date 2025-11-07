package interview_only_sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_12 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
for(int i=1;i<3;i++)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,700)");
}
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@*='ta1']")));
driver.findElement(By.xpath("//textarea[@*='ta1']")).sendKeys(" Explicitly Wait programme practice for an interview . ");
	}

}
