package com.choucair.formacion.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class MeetPage extends PageObject{
	
	
	By btnNewBussines = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
	By txtNameBussines = By.xpath("//*[@id=\"StartSharp_Organization_BusinessUnitDialog7_Name\"]");
	By btnGuardar = By.xpath("//*[@id='StartSharp_Organization_BusinessUnitDialog7_Toolbar']/div/div/div/div[1]/div/span");
					
	
	public void clickNewBussines() {
		getDriver().findElement(btnNewBussines).click();
	}
	public void newBussines(String name) {
		getDriver().findElement(txtNameBussines).sendKeys(name);
	}
	public void clickSaveNewBussines() {
		getDriver().findElement(btnGuardar).click();
	}	
	/*public void selectInsurance(String insurance) {
		Select select = new Select(getDriver().findElement(listInsuranceSum));
		select.selectByValue(insurance);
	}*/
	
	
	
	
}
