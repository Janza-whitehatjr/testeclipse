package com.kkem.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestClass_1 extends DriverSetUp{
	@Test
	public void Fillform() {
		WebElement username= driver.findElement(By.id("name"));
		username.sendKeys("Janza Rasheed A");
	}
	@Test
	public void mobNum() {
		WebElement mob_num= driver.findElement(By.id("phone"));
		mob_num.sendKeys("9876543322");
		
	}
	@Test
	public void eAddress() {
		WebElement e_mail= driver.findElement(By.id("email"));
		e_mail.sendKeys("janzaanas@65@gmail.com");
	}
	@Test
	public void password() {
		WebElement pswrd= driver.findElement(By.id("password"));
		pswrd.sendKeys("janza123");
	}
	@Test
	public void address() {
		WebElement address= driver.findElement(By.id("address"));
		address.sendKeys("Janza, Kollam");
	}
	@Test
	public void submit() {
		WebElement submitbtn= driver.findElement(By.name("submit"));
		submitbtn.click();
		
	}
	@AfterSuite
    public void teardown() throws InterruptedException {
		Thread.sleep(5000);
    	driver.quit();
    }
	
	


}
