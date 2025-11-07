package interview_only_sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_AutoSuggestion {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.navigate().to("https://www.google.com");
driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
List<WebElement> list=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
System.out.println(list.size());
for(WebElement r:list)
{
	System.out.println(r.getText());
}
	}

}
