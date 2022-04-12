package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement fn;
	@FindBy(id = "last_name")
	private WebElement ln;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cc;
	@FindBy(id = "cc_type")
	private WebElement type;
	@FindBy(id = "cc_exp_month")
	private WebElement em;
	@FindBy(id = "cc_exp_year")
	private WebElement ey;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement book;

	public HotelBooking(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getEm() {
		return em;
	}

	public WebElement getEy() {
		return ey;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
