package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	// all methods in base class will be child class, things we dont know here are
	// kept as parameter

//browser launch
	public static WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Software\\Greens JAVA\\Adactin_Project_Final\\Driver\\chromedriver.exe");

			// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
			// + "\\Driver\\chromedriver.exe");

			// WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.chrome.driver", "E:\\Software\\Greens
			// JAVA\\BD_Project\\Driver\\chromedriver.exe");

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			// WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			// System.setProperty("webdriver.chrome.driver", "E:\\Software\\Greens
			// JAVA\\BD_Project\\Driver\\chromedriver.exe");

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			// WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}
		return driver;

	}

//close
	public static void close() {
		driver.close();
	}

//quit
	public static void quit() {
		driver.quit();
	}

//getUrl
	public static void getUrl(String url) {
		driver.get(url);
	}

//getTitle
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

//getCurrentUrl
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

//getText
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

//refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

//back
	public static void back() {
		driver.navigate().back();
	}

//forward
	public static void forward() {
		driver.navigate().forward();
	}

//navigateTo
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

//inputValueElement
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

//clickOnElement
	public static void clickOnElement(WebElement element) {
		element.click();
	}

//clear
	public static void clear(WebElement element) {
		element.clear();
	}

//isEnabled
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("is enabled" + enabled);
	}

//isDisplayed
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("is displayed" + displayed);
	}

//isSelected
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("is selected" + selected);
	}

//getAttribute
	public static void getAttribute(WebElement element, String type) {
		if (type.equalsIgnoreCase("value")) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
		} else if (type.equalsIgnoreCase("name")) {
			String attribute = element.getAttribute("name");
			System.out.println(attribute);
		}
	}

//singledropdown
	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}

		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}

		else if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}
	}

//wait
	public static void wait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

//alert
	public static void alert(String alerttype) {
		Alert alert = driver.switchTo().alert();

		if (alerttype.equalsIgnoreCase("ok")) {
			alert.accept();
		} else if (alerttype.equalsIgnoreCase("cancel")) {
			alert.dismiss();
		}
		if (alerttype.equalsIgnoreCase("gettext")) {
			alert.getText();
		}
	}

//actions
	public static void action(WebElement element, String type) {
		Actions act = new Actions(driver);
		if (type.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		} else if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).build().perform();
		}
	}

//dragdrop
	public static void dragdrop(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}

//windowshandles using index
	public static void windowhandles(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(i));
	}

//windowshandles using title
	public static void windowhandlestitle(String actual) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String all : windowHandles) {
			if (driver.switchTo().window(all).getTitle().equals(actual)) {
				break;
			}
		}
	}

//frames
	public static void singleframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	public static void multipleframe(WebElement outerframe, WebElement innerframe) {
		driver.switchTo().frame(outerframe);
		driver.switchTo().frame(innerframe);
	}

//screenshot
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Software\\Greens JAVA\\Adactin_Project_Final\\Screenshot\\" + filename + ".png");
		FileUtils.copyFile(src, dest);
	}

//robot
	public static void robot(String type) throws AWTException {
		Robot r = new Robot();

		if (type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (type.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
		}

	}

}
