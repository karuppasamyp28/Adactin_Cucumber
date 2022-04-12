package com.config.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"E:\\Software\\Greens JAVA\\Adactin_Project_Final\\src\\main\\java\\com\\config\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getLocation() {
		String location = p.getProperty("location");
		return location;

	}

	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}

	public String getRoomtype() {
		String roomtype = p.getProperty("roomtype");
		return roomtype;
	}

	public String getRoomno() {
		String roomno = p.getProperty("room_nos");
		return roomno;
	}

	public String getCheckindate() {
		String indate = p.getProperty("datepick_in");
		return indate;
	}

	public String getCheckoutdate() {
		String outdate = p.getProperty("datepick_out");
		return outdate;
	}

	public String getAdultroom() {
		String adultroom = p.getProperty("adult_room");
		return adultroom;
	}

	public String getChildroom() {
		String childroom = p.getProperty("child_room");
		return childroom;
	}

	public String getFirstname() {
		String fname = p.getProperty("firstname");
		return fname;
	}

	public String getLastname() {
		String lname = p.getProperty("lastname");
		return lname;
	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String getCcno() {
		String ccno = p.getProperty("ccno");
		return ccno;

	}

	public String getCctype() {
		String cctype = p.getProperty("cc_type");
		return cctype;
	}

	public String getCcexpmonth() {
		String ccexpmonth = p.getProperty("cc_exp_month");
		return ccexpmonth;
	}

	public String getCcexpyear() {
		String ccexpyear = p.getProperty("cc_exp_year");
		return ccexpyear;
	}

	public String getCvvno() {
		String cvvno = p.getProperty("cvvno");
		return cvvno;
	}
}
