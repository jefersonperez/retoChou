package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.MeetingDatesPage;

import net.thucydides.core.annotations.Step;

public class MeetDatesStep {
	MeetingDatesPage pricePage;
	
	@Step
	public void clickMeeting() {
		pricePage.clickMeeting();
	}
	
	@Step
	public void clickAuxMeeting() {
		pricePage.clickAuxMeeting();
	}
	
	@Step
	public void clickNewMeeting()  {
		pricePage.clickNewMeeting();
	}
	@Step
	public void enterMeetingName (String meetingName) {
		pricePage.meetingName(meetingName);
	}
	@Step
	public void enterMeetingNumber (String meetingNumber) {
		pricePage.meetingNumber(meetingNumber);
	}
	@Step
	public void selectUnit (String unit) {
		pricePage.selectUnit(unit);
	}
	@Step
	public void clickSaveMeeting()  {
		pricePage.clickBtnSave();
	}
}
