package WebDriver_Methods;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
		Dimension d=un.getSize();
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println(d+"\nh ="+h+"\nw = "+w);
		Thread.sleep(3400);
		driver.quit();
	}

}
