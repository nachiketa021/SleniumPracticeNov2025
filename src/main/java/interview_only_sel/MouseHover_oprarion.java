package interview_only_sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_oprarion {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://omayo.blogspot.com/");
WebElement ele=driver.findElement(By.xpath("//span[.='Blogs']"));
Actions act=new Actions(driver);
act.moveToElement(ele).perform();

	}

}
