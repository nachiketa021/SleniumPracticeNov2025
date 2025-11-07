package WebDriver_Methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		String at = driver.getTitle();
		System.out.println("Actual Title : " + at);
		String et = "google";
		if (at.equalsIgnoreCase(et)) {
			System.out.println("Title is Matching. ");
		} else {
			System.out.println("Title is not Matching .");
		}
		String curl = driver.getCurrentUrl();
		System.out.println("_______________________________________________________________");
		System.out.println(curl);
		if (curl.contains(".com")) {
			System.out.println("Url is martching .");
		} else {
			System.out.println("Url is not matching .");
		}
	}

}
