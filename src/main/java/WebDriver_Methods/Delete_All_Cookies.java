package WebDriver_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_All_Cookies {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);
driver.get("https://www.google.com");
System.out.println(driver.getCurrentUrl());
driver.manage().deleteAllCookies();
System.out.println("All Cookies are Deleted .");
Thread.sleep(2700);
driver.quit();
	}

}
