package com.choucair.formacion.definition;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.choucair.formacion.models.Insurant;
import com.choucair.formacion.models.Meet;
import com.choucair.formacion.models.MeetCreate;
import com.choucair.formacion.models.MeetDates;
import com.choucair.formacion.models.Login;
import com.choucair.formacion.steps.HomeStep;
import com.choucair.formacion.steps.InsuranceStep;
import com.choucair.formacion.steps.MeetDatesStep;
import com.choucair.formacion.steps.MeetStep;
import com.choucair.formacion.steps.MeetCreateStep;
import com.choucair.formacion.steps.LoginStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InsuranceStepDefinition {

	String validacionAlerta="Sending e-mail success!";
	@Steps
	HomeStep homeStep;
	
	@Steps
	LoginStep loginStep;
	
	@Steps
	InsuranceStep insuranceStep;
	
	@Steps
	MeetStep productStep;
	
	@Steps
	MeetDatesStep priceStep;
	
	@Steps
	MeetCreateStep quoteStep;
	
	

	@Given("^I am on the home page StarSharp$")
	public void iAmOnTheHomePageStarSharp() throws Throwable {
	    homeStep.openHomePage();
	}

	
	@When("^I perform the authentication in the application$")
	public void IPerformTheAuthenticationInTheApplication(List<Login> login) throws Throwable {
		loginStep.enterDataUserName(login.get(0).getUser());
		loginStep.enterDataPassword(login.get(0).getPassword());
		loginStep.clickBtnSign();
	}

	@When("^I go to the menu organizations business units$")
	public void IGoToTheMenuOrganizationsBusinesUunits() throws Throwable {
				    
	    insuranceStep.goBussinessUnit();
	}

	@When("^I create a new business unit$")
	public void enterProductData(List<Meet> meet) throws Throwable {
	    productStep.clickNewBussines();
	    productStep.newBussines(meet.get(1).getNameMeet());
	    productStep.clickSaveNewBussines();
	}

	@When("^I create a new meeting$")
	public void iSelectUltimateInsurance(List<MeetDates> meetDates) throws Throwable {
	    priceStep.clickMeeting();
	    priceStep.clickAuxMeeting();
	    priceStep.clickNewMeeting();
	    priceStep.enterMeetingName(meetDates.get(0).getMeetingName());
	    priceStep.enterMeetingNumber(meetDates.get(0).getMeetingNumber());
	    priceStep.selectUnit(meetDates.get(0).getMeetingUnuit());
	    priceStep.clickSaveMeeting();
	}

	@Then("^I verify the meeting$")
	public void iVerifyMeeting(List<MeetCreate> meetDates) throws Throwable {
		quoteStep.validateMeet(meetDates.get(1).getNameMeet());
	}

	
}
