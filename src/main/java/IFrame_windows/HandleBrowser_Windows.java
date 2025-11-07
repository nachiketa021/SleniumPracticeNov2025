package IFrame_windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser_Windows {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//String windowId=driver.getWindowHandle();
//System.out.println(windowId);
driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
Set<String> windowIds=driver.getWindowHandles();
System.out.println(windowIds.size());

//Iterator<String> it=windowIds.iterator();
//String ParentWindow=it.next();
//String ChildWindow=it.next();
//System.out.println("Parent_Window : "+ParentWindow);
//System.out.println("Child_Window : "+ChildWindow);
ArrayList<String> windowIdsList= new ArrayList<String>(windowIds);
String ParentWindow=windowIdsList.get(0);
String ChildWindow=windowIdsList.get(1);
System.out.println("Parent_Window : "+ParentWindow);
System.out.println("Child_Window : "+ChildWindow);


	}

	

}
