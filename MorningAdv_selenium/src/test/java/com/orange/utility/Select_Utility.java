package com.orange.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Utility 
{
 public static void sel_option(WebElement ele,Object data)
 {
	 Select sele = Utility_Object.select_object(ele);
	 if(data instanceof Integer)
	 {
		 sele.selectByIndex((Integer)data);
	 }
	 else if(data instanceof String)
	 {
		try 
		{
			sele.selectByValue((String)data);
		} 
		catch (Exception e)
		{
			sele.selectByVisibleText((String)data);
		} 
		
	 }
 }
 public static void dsel_option(WebElement ele,Object data)
 {
	 Select sele = Utility_Object.select_object(ele);
	 if(data instanceof Integer)
	 {
		 sele.selectByIndex((Integer)data);
	 }
	 else if(data instanceof String)
	 {
		try 
		{
			sele.selectByValue((String)data);
		} 
		catch (Exception e)
		{
			sele.selectByVisibleText((String)data);
		} 
		
	 }
 }
 public static List<WebElement> dese_all_opt(WebElement ele)
 {
	 Select sele = Utility_Object.select_object(ele); 
	 sele.deselectAll();
 
// public Static void get_options(WebElement ele)
 {
	 
	 Select sel  = Utility_Object.select_object(ele); 
	return sel.getOptions(); 
 }
}
}