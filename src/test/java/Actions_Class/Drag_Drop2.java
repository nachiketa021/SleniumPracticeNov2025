package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
WebElement src=driver.findElement(By.xpath("//div[contains(text(),'Oslo')][@id='box1']"));
WebElement trg=driver.findElement(By.xpath("//div[@*='countries']//div[.='Norway']"));

Actions act=new Actions(driver);
act.dragAndDrop(src, trg);
act.build().perform();

	}

}
