package com.pom;

import org.openqa.selenium.WebDriver;

import com.pageobject.HotelBooking;
import com.pageobject.LogOut;
import com.pageobject.LoginPage;
import com.pageobject.SearchHotel;
import com.pageobject.SelectHotel;

public class PageObjectManager {
	public static WebDriver driver;
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel hp;
	private HotelBooking hb;
	private LogOut lo;
	
	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}
		
	
	public SelectHotel getHp() {
		hp = new SelectHotel(driver);
		return hp;
	}
	
	public HotelBooking getHb() {
		hb = new HotelBooking(driver);
		return hb;
	}
	
	public LogOut getLo() {
		lo = new LogOut(driver);
		return lo;
	}
	
	
	
	
}
