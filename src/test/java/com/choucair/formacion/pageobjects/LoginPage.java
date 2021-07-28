package com.choucair.formacion.pageobjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
	
	By txtUserName = By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Username\"]");
	By txtPassword = By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Password\"]");
	By btnSign = By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]");

	
	public void userName (String user) {
			
		getDriver().findElement(txtUserName).sendKeys(user);
	}
	
	public void password(String password) {
		getDriver().findElement(txtPassword).sendKeys(password);
	}
	public void clickBtnSign() {
		getDriver().findElement(btnSign).click();
	}
}
