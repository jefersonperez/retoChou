package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.MeetCreatePage;

import net.thucydides.core.annotations.Step;

public class MeetCreateStep {
	MeetCreatePage quotePage;
	
	@Step
	public void validateMeet(String name) {
		quotePage.validateMeet(name);
		
	}
	

}
