package week2Selassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contactname {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement leafuser = driver.findElement(By.id("username"));
		leafuser.sendKeys("democsr");
		WebElement leafpassword = driver.findElement(By.id("password"));
		leafpassword.sendKeys("crmsfa");
		WebElement leaflogin = driver.findElement(By.className("decorativeSubmit"));
		leaflogin.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		WebElement firstname = driver.findElement(By.id("firstNameField"));
		firstname.sendKeys("Rajakumar");
		WebElement lastname = driver.findElement(By.id("lastNameField"));
		lastname.sendKeys("Ponnurangam");
		WebElement firstnamelocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstnamelocal.sendKeys("Raj");
		WebElement lastnamelocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastnamelocal.sendKeys("P");
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("Testing");
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("Test assignment");
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("testing123@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(state);
		dropdown1.selectByIndex(38);
		WebElement contactclick = driver.findElement(By.className("smallSubmit"));
		contactclick.click();
		WebElement edit = driver.findElement(By.className("subMenuButton"));
		edit.click();
		WebElement descriptionupdate = driver.findElement(By.id("updateContactForm_description"));
		descriptionupdate.clear();
		WebElement impnote = driver.findElement(By.id("updateContactForm_importantNote"));
		impnote.sendKeys("No description");
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		String pagetitle = driver.getTitle();
		System.out.println("the title of the page is " + pagetitle);
	}

}




