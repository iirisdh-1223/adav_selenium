package com.orange.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_Actions 
{
  public static void mouse_hover(WebDriver driver, WebElement element)
  {
	  Utility_Object.Actions_oblject(driver).moveToElement(element).perform();
  }
   
  public static void mouse_hover_click(WebDriver driver, WebElement element)
  {
	  Utility_Object.Actions_oblject(driver).moveToElement(element).click(element).perform();
  }
  
  public static void right_click(WebDriver driver, WebElement element)
  {
	  Utility_Object.Actions_oblject(driver).contextClick(element).perform();
  }
  public static void double_click(WebDriver driver, WebElement element)
  {
	  Utility_Object.Actions_oblject(driver).doubleClick(element).perform();
  }
  public static void drag_drop(WebDriver driver, WebElement element,WebElement element1)
  {
	  Utility_Object.Actions_oblject(driver).dragAndDrop(element,element1).perform();
  }
}

