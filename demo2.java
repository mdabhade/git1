package com.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		
//		dr.manage().window().maximize();
//		  System.out.println(dr.getTitle());
		dr.get("https://www.google.com");
        Thread.sleep(4000);
		dr.get("https://www.gmail.com");
		dr.navigate().back();
		System.out.println(dr.manage().window().getSize());
		Dimension d=new Dimension(400, 300);
		dr.manage().window().setSize(d);
//		dr.close();
		
	}

}
