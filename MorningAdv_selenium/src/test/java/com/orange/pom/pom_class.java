package com.orange.pom; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class
{
@FindBy(name="username")
private WebElement untxt;
@FindBy(name="password")
private WebElement passtxt;
@FindBy(xpath = "//button[@type='submit']")
private WebElement loginbutton;

public pom_class(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getun()
{
	return untxt;
}
public WebElement getpass()
{
	return passtxt;
}
public WebElement getloginbutton()
{
	return loginbutton;
}

}