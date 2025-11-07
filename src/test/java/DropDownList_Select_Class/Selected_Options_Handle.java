package DropDownList_Select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selected_Options_Handle {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://omayo.blogspot.com/");
WebElement ddl=driver.findElement(By.xpath("//select[@*='multiselect1']"));
Select sel=new Select(ddl);
List<WebElement> opts=sel.getOptions();
System.out.println(opts.size());
for(WebElement r:opts)
{
	System.out.println(r.getText());
}
System.out.println(sel.isMultiple());
System.out.println("_______________________________________________________");
sel.selectByVisibleText("Swift");
sel.selectByIndex(2);
sel.selectByIndex(3);
WebElement fsp=sel.getFirstSelectedOption();
System.out.println("First Selected Option : "+fsp.getText());
List<WebElement> sopt=sel.getAllSelectedOptions();
for(WebElement t:sopt)
{
	System.out.println(t.getText());
}
Thread.sleep(3000);
driver.quit();

	}

}
