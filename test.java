package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new ChromeDriver();
		
		
		WebDriver dr = new ChromeDriver();

		dr.get("https://www.google.com");

		dr.manage().window().maximize();

       // Thread.sleep(3000);

        System.out.println(dr.getTitle());
        dr.get("https://www.gmail.com");
        Thread.sleep(4000);
		dr.get("https://www.gmail.com");
		dr.navigate().back();

		System.out.println(dr.getTitle().equalsIgnoreCase(dr.getTitle()));

		dr.manage().window().maximize();

		

		System.out.println(dr.getCurrentUrl());
	}

}
