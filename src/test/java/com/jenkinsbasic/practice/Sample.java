package com.jenkinsbasic.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void parameterTest()
	{
		WebDriver driver = null;
		String url="http://localhost:8888";
		String browser="chrome";
		switch(browser)
		{
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
		}
		driver.get(url);
		System.out.println("Opened");
		driver.quit();
	}
}