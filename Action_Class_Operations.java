package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Operations {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.saucelabs.com/am/XUI/#login/");
		System.out.println(d.getTitle());
		WebElement textbox=d.findElement(By.id("idToken1"));
		Actions a=new Actions(d);
		a.moveToElement(textbox).contextClick().build().perform();
		textbox.sendKeys("manisha dabhade");
		a.doubleClick(textbox).build().perform();

	}

}
