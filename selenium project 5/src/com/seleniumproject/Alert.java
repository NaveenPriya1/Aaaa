package com.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		//registering driver
				String path = "C:\\Users\\saira\\Downloads\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				WebDriver driver = new ChromeDriver();
				
				String base_url = "https://nxtgenaiacademy.com/alertandpopup/";
				
				driver.get(base_url);
				
				driver.findElement(By.name("alertbox")).click();
				driver.switchTo().alert().accept();
				
				driver.findElement(By.name("confirmalertbox")).click();
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("demo")).getText());
				
				driver.findElement(By.name("promptalertbox1234")).click();
				driver.switchTo().alert().sendKeys("Yes");
				driver.switchTo().alert().accept();
				
				System.out.println(driver.findElement(By.id("demoone")).getText());
				

	}

}
