package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkTest {

	public static void main(String[] args) {
		//step:1 Declare the Path of Chromedriver
		String path="C:\\Users\\saira\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//step:2 initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//step:3 base url
		String base_url="http://www.facebook.com/";
		
		
		//step: 4 Launching Facebook
		driver.get(base_url);
		
		//Find by id
		WebElement email1 = driver.findElement(By.id("email"));
		
		WebElement email2 = driver.findElement(By.name("email"));
		
		System.out.println("Id and name found :-"+email1.equals(email2));
		
		WebElement xpathEmail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		System.out.println("Id and XpathFound :"+email1.equals(xpathEmail));
		
		WebElement FullxpathEmail = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		
		System.out.println("Id and FullXpathFound :"+email1.equals(FullxpathEmail));
		
		WebElement cssSelector = driver.findElement(By.cssSelector("#email"));
		
		System.out.println("id and cssSelector Found :"+email1.equals(cssSelector));
		
		List<WebElement> list = driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println();
		}
	}

}
