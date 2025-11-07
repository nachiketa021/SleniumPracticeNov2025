package DropDownList_Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_select_DDL {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
driver.navigate().to("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/HtmlNew/ddl2.html");
WebElement ele=driver.findElement(By.xpath("//select[contains(@id,'f')]"));
Thread.sleep(3000);
ele.click();

	}

}
