package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest_website {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://practicetestautomation.com/practice-test-login/");
		
//		dr.findElement(By.id("username")).sendKeys("student");
//		dr.findElement(By.id("password")).sendKeys("Password123");
//		dr.findElement(By.id("submit")).click();
		
		
//		dr.findElement(By.id("username")).sendKeys("students");
//		dr.findElement(By.id("password")).sendKeys("Password");
//		dr.findElement(By.id("submit")).click();
		
//		dr.findElement(By.id("username")).sendKeys("student");
//		Thread.sleep(4000);
//		dr.findElement(By.id("Username")).clear();
//		dr.findElement(By.id("username")).sendKeys("stud");
//		dr.findElement(By.id("password")).sendKeys("Password123");
//		dr.findElement(By.id("submit")).click();
		
		WebElement we=dr.findElement(By.id("username"));
		we.sendKeys("manisha");
		we.clear();
		we.sendKeys("student");
		String s=we.getAttribute("value");
		System.out.println(s);
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
		System.out.println(we.getLocation());
		System.out.println(we.getSize());
		System.out.println(we.getTagName());
		
		
		dr.findElement(By.id("submit")).click();
		WebElement w2=dr.findElement(By.id("error"));
		Thread.sleep(1000);
		System.out.println(w2.getText());
		
		dr.findElement(By.id("username")).click();
		dr.findElement(By.id("username")).sendKeys("Password12");
		dr.findElement(By.id("submit")).click();
		WebElement w3=dr.findElement(By.id("error"));
		Thread.sleep(1000);
		System.out.println(w3.getText());
		
		
		
	}

}
