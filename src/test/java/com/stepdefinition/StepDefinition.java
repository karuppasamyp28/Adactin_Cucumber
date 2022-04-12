package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.config.helper.FileReaderManager;
import com.pom.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = BaseClass.browserLaunch("chrome");
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("user Launches The Application")
	public void user_launches_the_application() throws Throwable {
		// driver =
		// BaseClass.browserLaunch(FileReaderManager.getInstanceFrm().getInstanceCr().getBrowser());
		getUrl(FileReaderManager.getInstanceFrm().getInstanceCr().getUrl());
		wait(5);
	}

	@When("user Enters The Username In Usernamefield")
	public void user_enters_the_username_in_usernamefield() throws Throwable {
		inputValueElement(pom.getLp().getUsername(), FileReaderManager.getInstanceFrm().getInstanceCr().getUsername());
	}

	@When("user Enters The Password In Passwordfield")
	public void user_enters_the_password_in_passwordfield() throws Throwable {
		inputValueElement(pom.getLp().getPassword(), FileReaderManager.getInstanceFrm().getInstanceCr().getPassword());
	}

	@Then("user clicks The Login Button And It Navigates To The Search Hotel Page")
	public void user_clicks_the_login_button_and_it_navigates_to_the_search_hotel_page() {
		clickOnElement(pom.getLp().getSubmit());
	}

	@When("user Select The Location In Loacation Field")
	public void user_select_the_location_in_loacation_field() throws Throwable {
		dropDown(pom.getSh().getLocation(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getLocation());
	}

	@When("user Select The Hotels In Select Hotel Field")
	public void user_select_the_hotels_in_select_hotel_field() throws Throwable {
		dropDown(pom.getSh().getHotel(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getHotel());
	}

	@When("user Select The Roomtype In Select Roomtype Field")
	public void user_select_the_roomtype_in_select_roomtype_field() throws Throwable {
		dropDown(pom.getSh().getRoomtype(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getRoomtype());
	}

	@When("user Enters The Number Of Rooms")
	public void user_enters_the_number_of_rooms() throws Throwable {
		dropDown(pom.getSh().getRoomno(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getRoomno());
	}

	@When("user Select The CheckInDate")
	public void user_select_the_check_in_date() throws Throwable {
		inputValueElement(pom.getSh().getDatein(), FileReaderManager.getInstanceFrm().getInstanceCr().getCheckindate());
	}

	@When("user Select The CheckOutDate")
	public void user_select_the_check_out_date() throws Throwable {
		inputValueElement(pom.getSh().getDateout(),
				FileReaderManager.getInstanceFrm().getInstanceCr().getCheckoutdate());
	}

	@When("user Enters Adults Per Room")
	public void user_enters_adults_per_room() throws Throwable {
		dropDown(pom.getSh().getAdult(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getAdultroom());
	}

	@When("user Enters Child Per Room")
	public void user_enters_child_per_room() throws Throwable {
		dropDown(pom.getSh().getChild(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getChildroom());
	}

	@Then("user Clicks The Search Button And It Navigates To Next Page")
	public void user_clicks_the_search_button_and_it_navigates_to_next_page() throws Throwable {
		clickOnElement(pom.getSh().getSubmit());
	}

	@Given("user Selects The Radiobutton")
	public void user_selects_the_radiobutton() throws Throwable {
		clickOnElement(pom.getHp().getRadiobutton());
	}

	@Then("user Clicks To Continue")
	public void user_clicks_to_continue() throws Throwable {
		clickOnElement(pom.getHp().getNext());
	}

	@Given("user Enters Firstname In Required Field")
	public void user_enters_firstname_in_required_field() throws Throwable {
		inputValueElement(pom.getHb().getFn(), FileReaderManager.getInstanceFrm().getInstanceCr().getFirstname());
	}

	@Then("user Enters Lastname In Required Field")
	public void user_enters_lastname_in_required_field() throws Throwable {
		inputValueElement(pom.getHb().getLn(), FileReaderManager.getInstanceFrm().getInstanceCr().getLastname());
	}

	@Then("user Enters Address In Required Field")
	public void user_enters_address_in_required_field() throws Throwable {
		inputValueElement(pom.getHb().getAddress(), FileReaderManager.getInstanceFrm().getInstanceCr().getAddress());
	}

	@Then("user Enters Card Number In Required Field")
	public void user_enters_card_number_in_required_field() throws Throwable {
		inputValueElement(pom.getHb().getCc(), FileReaderManager.getInstanceFrm().getInstanceCr().getCcno());
	}

	@Then("user Selects Card Type")
	public void user_selects_card_type() throws Throwable {
		dropDown(pom.getHb().getType(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getCctype());
	}

	@Then("user selects Card Expire Month")
	public void user_selects_card_expire_month() throws Throwable {
		dropDown(pom.getHb().getEm(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getCcexpmonth());
	}

	@Then("user Selects Card Expire Year")
	public void user_selects_card_expire_year() throws Throwable {
		dropDown(pom.getHb().getEy(), "value", FileReaderManager.getInstanceFrm().getInstanceCr().getCcexpyear());
	}

	@Then("user Enters Cvv Number In Required Field")
	public void user_enters_cvv_number_in_required_field() throws Throwable {
		inputValueElement(pom.getHb().getCvv(), FileReaderManager.getInstanceFrm().getInstanceCr().getCvvno());
	}

	@Then("user Clicks The Book Now Button")
	public void user_clicks_the_book_now_button() throws Throwable {
		clickOnElement(pom.getHb().getBook());
		Thread.sleep(10000);
	}

	@Then("user Takes Screenshot")
	public void user_takes_screenshot() throws Throwable {
		screenshot("book");
	}

	@Given("user Clicks Logout Button")
	public void user_clicks_logout_button() throws Throwable {
		clickOnElement(pom.getLo().getLogout());
	}

}
