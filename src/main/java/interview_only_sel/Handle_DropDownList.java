package interview_only_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DropDownList {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/HtmlNew/ddl.html");
WebElement ddl=driver.findElement(By.xpath("//select[@*='car']"));
Select sel=new Select(ddl);
//sel.selectByContainsVisibleText("SA");
//sel.selectByVisibleText("SAAB");
//sel.selectByValue("saab");
sel.selectByIndex(1);
Thread.sleep(3800);
driver.quit();



	}

}
