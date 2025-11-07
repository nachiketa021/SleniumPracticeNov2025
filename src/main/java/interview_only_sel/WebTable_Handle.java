package interview_only_sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Handle {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/WebTable/WebTable.html");
WebElement row_2_data=driver.findElement(By.xpath("//table[@*='employeeTable']/tbody/tr[2]/td[2]"));
System.out.println(row_2_data.getText());
Thread.sleep(2500);
driver.quit();

	}

}
