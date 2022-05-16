package com.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) {
		//registering driver
				String path = "C:\\Users\\saira\\Downloads\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				WebDriver driver = new ChromeDriver();
				
				String base_url = "https://www.shine.com/register/general/";
				
				driver.get(base_url);
				
				WebElement username = driver.findElement(By.id("id_name"));
				
				Actions builder = new Actions(driver);
				Action seriesofAction = builder
		                .moveToElement(username)
		                .click()
		                .sendKeys(username,"Hello")
		                .keyDown(username,Keys.SHIFT)
		                .doubleClick()
		                .contextClick()
		                .build();
				
			    seriesofAction.perform();

	}

}
