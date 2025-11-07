package WebDriver_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		Dimension d=new Dimension(600,306);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		System.out.print(driver.getTitle());
		Thread.sleep(3000);
		driver.manage().window().minimize();
		//System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.close();

	}

}
