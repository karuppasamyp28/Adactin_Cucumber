package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;

	public SearchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement roomno;
	@FindBy(id = "datepick_in")
	private WebElement datein;
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	@FindBy(id = "adult_room")
	private WebElement adult;
	@FindBy(id = "child_room")
	private WebElement child;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

}