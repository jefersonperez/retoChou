package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {
	LoginPage loginPage;
	
	@Step
	public void enterDataUserName (String user) {
		loginPage.userName(user);
	}
	
	@Step
	public void enterDataPassword(String password) {
		loginPage.password(password);
	}
	@Step
	public void clickBtnSign() {
		loginPage.clickBtnSign();
	}
	
	
}
