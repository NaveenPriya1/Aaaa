package com.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineReg {

	public static void main(String[] args) {
		
		//registering driver
		String path = "C:\\Users\\saira\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		String base_url = "https://www.shine.com/register/general/";
		
		driver.get(base_url);
		
		WebElement name = driver.findElement(By.id("id_name"));
		name.sendKeys("Sridhar");
		
		WebElement email = driver.findElement(By.id("id_email"));
		email.sendKeys("sridhar.988577123@gmail.com");
		
		WebElement mobile = driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9885772446");
		
		WebElement password = driver.findElement(By.id("id_password"));
		password.sendKeys("Sridhar@12345");
		
		WebElement check = driver.findElement(By.id("id_privacy"));
		
		if(check.isSelected()) {
			System.out.println("Check box is select by default");
			System.out.println("Status of check box"+check.isSelected());
			
		}else {
			System.out.println(" c not selected");
		}
		
		WebElement button = driver.findElement(By.id("registerButton"));
		button.click();
	}

}
