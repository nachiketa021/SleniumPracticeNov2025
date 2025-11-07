package interview_only_sel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Compare_price_flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.flipkart.com/");
		WebElement electronics=driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[4]"));
		electronics.click();
		Actions act=new Actions(driver);
		WebElement laptop_acc=driver.findElement(By.xpath("//a[.='Laptop Accessories']"));
		act.moveToElement(laptop_acc).perform();
		Thread.sleep(3000);
		WebElement mouse=driver.findElement(By.xpath("//a[.='Mouse']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",mouse);
		js.executeScript("window.scrollBy(0,300)");
		WebElement dell_mouse=driver.findElement(By.xpath("(//img[@class='DByuf4'])[4]"));
		dell_mouse.click();
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String> windows=new ArrayList<>(wins);
		System.out.println(windows.size());
		
		driver.switchTo().window(windows.get(1));
		System.out.println("index 1 :"+driver.getTitle());
		WebElement price2=driver.findElement(By.xpath("(//div[.='₹299'])[1]"));
		String dell_price2=price2.getText();
		System.out.println(dell_price2);
		
		
		driver.switchTo().window(windows.get(0));
		System.out.println("index 0 :"+driver.getTitle());
		WebElement price1=driver.findElement(By.xpath("(//div[.='₹299'])[2]"));
		String dell_price1=price1.getText();
		System.out.println(dell_price1);
		System.out.println("------------------------------------------------------------------------");
		if(dell_price2.equals(dell_price1))
		{
			System.out.println("Price is matching .");
		}else {
			System.out.println("Price is not matching .");
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
