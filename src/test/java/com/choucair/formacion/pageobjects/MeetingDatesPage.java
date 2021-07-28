package com.choucair.formacion.pageobjects;


import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opera.core.systems.internal.input.KeyEvent;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class MeetingDatesPage extends PageObject{
	
	By btnMeeting = By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/a");
	By btnAuxMeeting = By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/ul/li[1]/a");
	
	By btnNewMeeting = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
	By txtMeetingName = By.xpath("//*[@id='StartSharp_Meeting_MeetingDialog14_MeetingName']");
	By txtMeetingNumber = By.xpath("//*[@id='StartSharp_Meeting_MeetingDialog14_MeetingNumber']");
	
	By sctUnit = By.xpath("//*[@id='select2-chosen-8']");
	By campoUnit = By.xpath("//*[@id='s2id_autogen8_search']");
							
	By btnSave = By.xpath("//*[@id='StartSharp_Meeting_MeetingDialog14_Toolbar']/div/div/div/div[1]/div/span");
	public void clickMeeting() {
		getDriver().findElement(btnMeeting).click();
	}
	public void clickAuxMeeting() {
		getDriver().findElement(btnAuxMeeting).click();
		
	}
	public void clickNewMeeting() {
		getDriver().findElement(btnNewMeeting).click();
		
	}
	public void meetingName (String meetingName) {
		
		getDriver().findElement(txtMeetingName).sendKeys(meetingName);
	}
	public void meetingNumber (String meetingNumber) {
		
		getDriver().findElement(txtMeetingNumber).sendKeys(meetingNumber);
	}
	public void selectUnit(String unit) {
		
		getDriver().findElement(sctUnit).click();
		getDriver().findElement(campoUnit).sendKeys(unit);
	
		getDriver().findElement(campoUnit).sendKeys(Keys.ENTER);
	}
	public void clickBtnSave() {
		getDriver().findElement(btnSave).click();
		
	}
	
	
	/*public void clickNextSend() throws InterruptedException {
		Thread.sleep(10000);
		Thread.sleep(10000);
//		esperarElementoVisible(btnNextSendQuote);
//		getDriver().findElement(btnNextSendQuote).click();
	}*/
	

	public void esperarElementoVisible(By elementoVisible) {
		try {
			(new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.visibilityOfElementLocated(elementoVisible));

		} catch (TimeoutException e) {
			System.out.println(e);
		}
	}
}
