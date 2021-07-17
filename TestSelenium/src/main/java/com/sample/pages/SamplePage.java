package com.sample.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\milly\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
       List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            String url = it.next().getAttribute("href");
            
            System.out.println(url);
        }
		
		
        //driver.findElement(By.name("send")).click();
		
		
		


	}

}
