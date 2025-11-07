package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ge_Set_Position {

	public static void main(String[] args) {
WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
driver.get("https://www.facebook.com");
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
Point p=new Point(25,20);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
driver.quit();
	}

}
