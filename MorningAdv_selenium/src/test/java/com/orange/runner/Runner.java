package com.orange.runner;


import org.testng.annotations.Test;

import com.orange.generic.Base_Class;
import com.orange.pom.pom_class;

public class Runner extends Base_Class {
@Test
public void login() throws InterruptedException
{
	pom_class p=new pom_class(driver);
	p.getun().sendKeys("Admin");
	//wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("Admin");
	p.getpass().sendKeys("admin123");
	p.getloginbutton().click();
	Thread.sleep(1000);
	
	
}
}