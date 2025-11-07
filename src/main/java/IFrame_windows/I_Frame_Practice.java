package IFrame_windows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//frame[@*='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		System.out.println("Frame 1 switch succesfully ");
		driver.findElement(By.xpath("//input[@*='mytext1']")).sendKeys("Frame_1 Find");
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@*='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//form[@*='id2']//input")).sendKeys("Frame_2 Find");
		driver.switchTo().parentFrame();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@*='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@*='mytext3']")).sendKeys("Frame 3 Find");
		
		driver.switchTo().frame(0);
		
		//Using JavascriptExecutor 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)");
		WebElement radio_B=driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]"));
		js.executeScript("arguments[0].click();",radio_B);
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
