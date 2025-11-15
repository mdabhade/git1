package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Handling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		String pw=wd.getWindowHandle();
		wd.get("https://www.google.com/");
		String pw2=wd.getWindowHandle();
		wd.switchTo().newWindow(WindowType.TAB);
		wd.get("https://www.gmail.com/");
		String pw3=wd.getWindowHandle();
		wd.switchTo().newWindow(WindowType.TAB);
		wd.get("https://openai.com/index/chatgpt/");
		wd.switchTo().window(pw2);
//		Thread.sleep(1000);
//		wd.switchTo().window(pw);
//		Thread.sleep(1000);
//		wd.switchTo().window(pw3);
//		Thread.sleep(1000);
//		wd.quit();
	}

}
