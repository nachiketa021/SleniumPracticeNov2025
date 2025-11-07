package DropDownList_Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Option {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/HtmlNew/ddl.html");
WebElement ddl=driver.findElement(By.xpath("//select[@*='car']"));
Select sel=new Select(ddl);
//sel.selectByContainsVisibleText("SA");
//sel.selectByVisibleText("SAAB");
//sel.selectByValue("saab");
sel.selectByIndex(5);
//sel.selectByVisibleText("Qspider");
Thread.sleep(4701);
driver.quit();
	}

}
