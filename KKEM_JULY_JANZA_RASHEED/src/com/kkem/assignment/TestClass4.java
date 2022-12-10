package com.kkem.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestClass4 extends DriverSetUp {
	@Test
	public void experience() {
		WebElement radio= driver.findElement(By.xpath("//input[@id='2years']"));
		radio.click();
	}
	@Test
	public void tools() {
		WebElement tool1= driver.findElement(By.xpath("//input[@id='selenium']"));
		tool1.click();
		WebElement tool2 = driver.findElement(By.xpath("//input[@id='testng']"));
		tool2.click();
		
	}
	@AfterSuite
    public void teardown() throws InterruptedException {
		Thread.sleep(5000);
    	driver.quit();
    }

}
