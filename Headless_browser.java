package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless_browser {
	public static void main(String[] args) {
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("headless");
		WebDriver dr=new ChromeDriver(cp);
		dr.get("https://www.google.com/");
		System.out.println(dr.getTitle());
		
		FirefoxOptions fp=new FirefoxOptions();
		fp.addArguments("incognito");
		WebDriver dr2=new FirefoxDriver(fp);
		dr2.get("https://www.google.com/");
		System.out.println(dr2.getTitle());
	}

}
