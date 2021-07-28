package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.HomePage;

import net.thucydides.core.annotations.Step;

public class HomeStep {
	HomePage homePage;
	
	@Step
	public void openHomePage() {
		homePage.open();
		
	}
	
	
}
