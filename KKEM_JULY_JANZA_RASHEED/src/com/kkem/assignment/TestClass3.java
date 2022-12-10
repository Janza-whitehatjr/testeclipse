package com.kkem.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestClass3 extends DriverSetUp{
	@Test
	public void place() {
		Select se = new Select(driver.findElement(By.cssSelector("select.custom-select")));
		se.selectByValue("1");
	}
	@AfterSuite
    public void teardown() throws InterruptedException {
		Thread.sleep(5000);
    	driver.quit();
    }

	

}
