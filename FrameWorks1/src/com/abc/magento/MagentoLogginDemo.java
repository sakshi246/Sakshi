package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogginDemo {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("D:\\eclipse\\selenium\\FrameWorks1\\src\\DataDrivenFrameWork1.properties");
   Properties p=new Properties();
   p.load(fis);
   String urldata="http://www.magento.com";
   String usernamedata="ihassan395@gmail.com";
   String passworddata="Welcome@123";
   System.out.println(urldata);
   System.out.println(usernamedata);
   WebDriver driver=new ChromeDriver();
   driver.get(urldata);
   driver.findElement(By.linkText("My Account")).click();
   driver.findElement(By.id("email")).sendKeys(usernamedata);
   driver.findElement(By.id("pass")).sendKeys(passworddata);
   driver.findElement(By.id("send2")).click();
   driver.findElement(By.linkText("Log Out")).click();
   driver.close();
	}

}

