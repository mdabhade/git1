package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tutorialPoints {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		
		
		wd.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		// name
		WebElement name=wd.findElement(By.id("name"));
		name.sendKeys("manisha");
		// email
		WebElement email=wd.findElement(By.id("email"));
        email.sendKeys("abc@gmail.com");
        // gender
        // wd.findElement(By.id("gender")).click();
        Thread.sleep(1000);
        wd.findElement(By.xpath("//input[@id='name']//following::input[3]")).click();
        // mobile no
        WebElement mobile=wd.findElement(By.xpath("//input[@id='name']//following::input[5]"));
        mobile.sendKeys("8605261708");
        //dob
        wd.findElement(By.id("dob")).sendKeys("01/01/2025");
        // subject
        WebElement sub=wd.findElement(By.id("subjects"));
        sub.sendKeys("math");
        // Hobbies
        wd.findElement(By.xpath("//input[@id='name']//following::input[8]")).click();
        wd.findElement(By.xpath("//input[@id='name']//following::input[9]")).click();
        
        // picture
        wd.findElement(By.name("picture")).sendKeys("C:\\Users\\CDAC\\Pictures\\Screenshots\\Screenshot (1).png");

//        //Address
        wd.findElement(By.xpath("//textarea[@placeholder='Currend Address']")).sendKeys("Nashik");
        
        // select state
        WebElement state=wd.findElement(By.xpath("//select[@id='state']"));
        Select sr=new Select(state);
        sr.selectByIndex(3);
        
        // select city
        WebElement city=wd.findElement(By.xpath(" //select[@id='city']"));
        System.out.println(city.getText());
        Select sr2=new Select(city);
        sr2.selectByIndex(3);
        
        // submit
        wd.findElement(By.xpath(" //input[@type='submit']")).click();
        
        // login
        
        wd.findElement(By.xpath("//a[@href='login.php']")).click();
        
	}
	
}
