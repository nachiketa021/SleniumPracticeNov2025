package interview_only_sel;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_prog {

	public static void main(String[] args) throws Exception {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com");
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File trg=new File(System.getProperty("user.dir")+"/screenshots/homek1.png");
FileUtils.copyFile(src, trg);
Thread.sleep(3000);
driver.quit();
	}

}
