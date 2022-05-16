package com.seleniumproject;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	
	public static void main(String[] args) throws IOException,InterruptedException {
		 
		//assigning driver path
				String Path= "C:\\Users\\saira\\Downloads\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", Path);
				
				//initiate the driver
				WebDriver driver= new ChromeDriver();
				
				//giving Base Url
				String base_url="https://www.shine.com/register/general/";
				
				//launching in chrome
				driver.get(base_url);
				
				
				
				WebElement name= driver.findElement(By.id("id_name"));
				name.sendKeys("sridhar");
				
				WebElement email= driver.findElement(By.id("id_email"));
				email.sendKeys("rajurajuraju@yahoo.com");
				
				WebElement mobile = driver.findElement(By.id("id_cell_phone"));
				mobile.sendKeys("9585772410");
				
				WebElement password = driver.findElement(By.id("id_password"));
				password.sendKeys("Sridhar@12345");
				
				WebElement check = driver.findElement(By.id("id_privacy"));
				
				if(check.isSelected()) {
					System.out.println("Check box is select by default");
					System.out.println("Status of check box"+check.isSelected());
					
				}else {
					System.out.println(" c not selected");
				}
				
				
				
				
				///file upload
				
				WebElement element= driver.findElement(By.id("id_file"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				
				executor.executeScript("arguments[0].click()", element);
				
				Thread.sleep(5000);
				Runtime.getRuntime().exec("D:\\Screenshot\\upload1.exe");
				
				
				WebElement button = driver.findElement(By.id("registerButton"));
				button.click();
						
	}

}

