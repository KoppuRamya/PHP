package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclassd.WrapperEx;
import com.pages.page;

public class testcase extends WrapperEx
{
	@BeforeClass
	public void start() {
		Launchapp("chrome", "https://www.phptravels.net/home");
	}
	@Test
	public void Search_Contact() {
		page sp = new page(driver);
		sp.currency();
		sp.usd();
		sp.offers();
		sp.summer();
		sp.name("Ramya");
		sp.phone("7659977790");
		sp.message("Welcome");
		sp.searchcontact();
		String text=driver.findElement(By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div[1]")).getText();
		Assert.assertEquals("Thanks For Contacting",text);
		System.out.println("Passed");
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
