package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert a1=d.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
		
		d.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        d.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        
		Alert a2=d.switchTo().alert();
		System.out.println(a2.getText());
		a2.dismiss();
		WebElement e=d.findElement(By.xpath("//p[@id='demo']"));
        System.out.println(e.getText());
		
	}

}
