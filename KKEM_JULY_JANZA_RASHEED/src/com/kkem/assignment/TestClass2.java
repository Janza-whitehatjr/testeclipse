package com.kkem.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestClass2 extends DriverSetUp{
	
	@Test
	public void gender() {
		WebElement gender_radio= driver.findElement(By.cssSelector("input[name=\"optionsRadios\"][id=\"female\"]"));
		gender_radio.click();
	}
	@Test
	public void day() {
		WebElement day1= driver.findElement(By.id("tuesday"));
		day1.click();
		WebElement day2= driver.findElement(By.id("friday"));
		day2.click();
	}
	@AfterSuite
    public void teardown() throws InterruptedException {
		Thread.sleep(5000);
    	driver.quit();
    }

}
