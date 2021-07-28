package com.choucair.formacion.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;

public class MeetCreatePage extends PageObject{
	By txtSearh = By.xpath("//*[@id='GridDiv']/div[2]/div[1]/input");
	
	
	
	
	public void validateMeet(String name) {
		getDriver().findElement(txtSearh).sendKeys(name);		
		getDriver().findElement(txtSearh).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
