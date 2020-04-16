package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page 
{
	WebDriver driver;
	By currency = By.xpath("//*[@id=\"dropdownCurrency\"]");
	By USD = By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]");
	By Offers = By.xpath("/html/body/div[2]/div[1]/div[3]/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/a");
	By SummerVacation = By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div/div[2]/div/div/div[7]/div/div[2]/div/div[3]/div/div/a");
	By Name = By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[1]/input");
	By Phone = By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[2]/input");
	By Message = By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[4]/textarea");
	By Search_Contact = By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[6]/input[3]");

	public page(WebDriver driver)
	{
		this.driver = driver;
	}
			public void currency() 
			{
			driver.findElement(currency).click();
			}
			public void usd() 
			{
			driver.findElement(USD).click();
			}
			public void offers() 
			{
				driver.findElement(Offers).click();
			}
			public void summer() 
			{
				driver.findElement(SummerVacation).click();
			}
			public void name(String n) 
			{
				driver.findElement(Name).sendKeys(n);
			}
			public void phone(String p) 
			{
				driver.findElement(Phone).sendKeys(p);
			}
			public void message(String m)
			{
				driver.findElement(Message).sendKeys(m);
			}
			public void searchcontact() 
			{
				driver.findElement(Search_Contact).click();
			}
}
