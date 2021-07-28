package com.choucair.formacion.models;

public class MeetDates {
	public String meetingName;
	public String meetingNumber;
	public String meetingUnit;
	public MeetDates(String meetingName, String meetingNumber, String meetingUnit) {
		super();
		this.meetingName = meetingName;
		this.meetingNumber = meetingNumber;
		this.meetingUnit = meetingUnit;
	}
	public String getMeetingName() {
		return meetingName;
	}
	public String getMeetingNumber() {
		return meetingNumber;
	}
	public String getMeetingUnuit() {
		return meetingUnit;
	}
	
	
}
