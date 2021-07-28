package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.MeetPage;

import net.thucydides.core.annotations.Step;

public class MeetStep {
	MeetPage productPage;
	
	@Step
	public void clickNewBussines() {
		productPage.clickNewBussines();
	}
	
	@Step
	public void newBussines(String name) {
		productPage.newBussines(name);
	}
	@Step
	public void clickSaveNewBussines() {
		productPage.clickSaveNewBussines();
	}
	
	
	
}
