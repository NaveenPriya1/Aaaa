package com.seleniumproject;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot {

	public static void main(String[] args) {
		
		//registering driver
		String path = "C:\\Users\\saira\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		String base_url = "https://www.shine.com/register/general/";
		
		driver.get(base_url);
		
		TakesScreenshot screenshot =(TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("D://phase5//test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
