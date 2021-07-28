package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.InsurancePage;

import net.thucydides.core.annotations.Step;

public class InsuranceStep {
	InsurancePage insurancePage;
	
	
	
	@Step
	public void goBussinessUnit() {
		insurancePage.goBussinesUnit();
	}
}
