package week2Selassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		WebElement acmeemail = driver.findElement(By.id("email"));
		acmeemail.sendKeys("kumar.testleaf@gmail.com");
		WebElement acmepassword = driver.findElement(By.id("password"));
		acmepassword.sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		String pagetitle = driver.getTitle();
		System.out.println("the title of the page is " + pagetitle);
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();
	}

}




