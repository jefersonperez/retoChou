package com.choucair.formacion.pageobjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sampleapp.tricentis.com/101/index.php")

public class InsurancePage extends PageObject {
	
	
	
	
	By btnOrganizacion = By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/a/span");
	By btnBussinesUnit = By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/ul/li[1]/a/span");
	
	public void goBussinesUnit() {
		getDriver().findElement(btnOrganizacion).click();
		getDriver().findElement(btnBussinesUnit).click();
	}
	
}
