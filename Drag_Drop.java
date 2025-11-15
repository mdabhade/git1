package com.test;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;


public class Drag_Drop {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d=new ChromeDriver();
//		d.get("https://demo.automationtesting.in/Static.html");
//		WebElement e1=d.findElement(By.id("angular"));
//		WebElement e2=d.findElement(By.id("droparea"));
//		
//		Actions a=new Actions(d);
//		a.dragAndDrop(e1, e2).build().perform();
//		
//		WebElement e3=d.findElement(By.id("mongo"));
//		WebElement e4=d.findElement(By.id("droparea"));
//		Actions a2=new Actions(d);
//		a2.dragAndDrop(e3, e4).build().perform();
		
		
		
		d.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement e1=d.findElement(By.xpath("//*[@id=\"products\"]"));
		WebElement e2=d.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions a2=new Actions(d);
		a2.dragAndDrop(e1, e2).build().perform();
		
		

		
		Thread.sleep(1000);
		
		WebElement e3=d.findElement(By.id("credit2"));
		WebElement e4=d.findElement(By.id("bank"));
		Actions a3=new Actions(d);
		a3.dragAndDrop(e3, e4).build().perform();
		
		
		// taking screenshot
		
		File sc=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(sc,new File("C:\\Users\\CDAC\\Desktop\\Nosql\\picture.png"));

		
		
	}

}
