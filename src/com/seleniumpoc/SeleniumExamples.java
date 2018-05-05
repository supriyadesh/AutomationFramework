package com.seleniumpoc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExamples {
	WebDriver driver;

	enum locators  {id, name, className, tagName , linkedText, partialLinkedText , xPath, css};
	
	public void launchApplication(String browserName, String Url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/synerzip/eclipse-workspace/OopsDemo/chromedriver (2)");
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/synerzip/eclipse-workspace/OopsDemo/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Invalid browser name !!!" + browserName);
		}
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	
	
	
	public void closeApplication() {
//		driver.close();
		driver.quit();
	}
	
	public void login() {
		By linkAddress = By.linkText("Form Authentication");
		WebElement element = driver.findElement(linkAddress);
		element.click();
		
		By userNameAddress = By.id("username");
		WebElement userNameElement = driver.findElement(userNameAddress);
		userNameElement.sendKeys("tomsmith");
		
		By passwordNameAddress = By.id("password");
		WebElement passwordNameElement = driver.findElement(passwordNameAddress);
		passwordNameElement.sendKeys("SuperSecretPassword!");
		
		By buttonLogin = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
		WebElement eleButton = driver.findElement(buttonLogin);
		eleButton.click();
		
		By buttonLogout = By.xpath("//i[@class='icon-2x icon-signout']");
		WebElement eleLogoutBtn = driver.findElement(buttonLogout);
		eleLogoutBtn.click();
	
	}

	public void invalidLogin() {
		By linkAddress = By.linkText("Form Authentication");
		WebElement element = driver.findElement(linkAddress);
		element.click();
		
		By userNameAddress = By.id("username");
		WebElement userNameElement = driver.findElement(userNameAddress);
		userNameElement.sendKeys("tomsmith11");
		
		By passwordNameAddress = By.id("password");
		WebElement passwordNameElement = driver.findElement(passwordNameAddress);
		passwordNameElement.sendKeys("SuperSecretPassword!");
		
		By buttonLogin = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
		WebElement eleButton = driver.findElement(buttonLogin);
		eleButton.click();
		
		By flashMsg = By.id("flash-messages");
		WebElement flMsg = driver.findElement(flashMsg);
		String flash = flMsg.getText();
		if(flash.contains("Your username is invalid!")) {
			System.out.println("Invalid Login credentials");
		}else
		{
			System.out.println("logined in successfully");
		}
	
		By buttonLogout = By.xpath("//i[@class='icon-2x icon-signout']");
		WebElement eleLogoutBtn = driver.findElement(buttonLogout);
		eleLogoutBtn.click();
	}


	public void selectOptionFromDropdown(String type, String option) {
		By linkAddress = By.linkText("Dropdown");
		WebElement element = driver.findElement(linkAddress);
		element.click();
		
		By dropdownAddress = By.id("dropdown");
		WebElement dropdownElement = driver.findElement(dropdownAddress);
		
		Select sel = new Select(dropdownElement);
		
		if(type.equalsIgnoreCase("index")) {
			int optionInt = Integer.parseInt(option);
			sel.selectByIndex(optionInt);

		}else if(type.equalsIgnoreCase("value")) {
			sel.selectByValue(option);
			
		}else if(type.equalsIgnoreCase("visibleText")) {
			sel.selectByVisibleText(option);
			
		}
	}
	
	public void getAllOptionsFromDropdown() {
	
		By linkAddress = By.linkText("Dropdown");
		WebElement element = driver.findElement(linkAddress);
		element.click();
		
		By dropdownAddress = By.id("dropdown");
		WebElement dropdownElement = driver.findElement(dropdownAddress);

		Select sel = new Select(dropdownElement);

		List<WebElement> options = sel.getOptions();
		
		for (WebElement we:options ) {
			String visibleText = we.getText();
			System.out.println("DropDown list of visible text: " +visibleText);
		
			String attributeValue = we.getAttribute("value");
			System.out.println("\n\n\n\n DropDown list attribute values: " + attributeValue);
		}
		
	}

	public void getAllLinkOnHomePage() {

	
		List<WebElement> linkElements = identifyElements(locators.tagName, "a");

		for (WebElement we:linkElements) {
			String str = we.getText();
			String href = we.getAttribute("href");
			System.out.println("Get Elements by Text : " + str);
			System.out.println("\n\n\nGet Elements by href : " + href);
		}
	}

	

	public void getwindowTitleAndUrl() {
		String ParentHandle = driver.getWindowHandle();
		Set<String> parentHandles = driver.getWindowHandles();

		System.out.println("Parent Handle :" + ParentHandle);
		System.out.println("\n\n\n\n");
		
		HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
		
		for(String handles:parentHandles) {
			
			driver.switchTo().window(handles);
			List<String> values = new LinkedList<String>();
			values.add(driver.getTitle());
			values.add(driver.getCurrentUrl());

			hm.put(handles, values);

		}
		for(String key:hm.keySet()) {
			System.out.println("handle:"+ key);
			List<String> values = hm.get(key);
			for(String val:values) {
				
				if(values.indexOf(val) == 0) {
					System.out.println("\nTitle :"+ val);
				}else {
					
					System.out.println("\nCurrent Url: " + val);
				}
			}
		}
		
	
	}

	public WebElement identifyElement(locators type, String address) {
		
		switch(type) {
		case id : return driver.findElement(By.id(address));
			
		case name : return driver.findElement(By.name(address));
			
		case className: return driver.findElement(By.className(address));
			
		case tagName:return driver.findElement(By.tagName(address));
			
		case linkedText: return driver.findElement(By.linkText(address));
			
		case partialLinkedText:return driver.findElement(By.partialLinkText(address));
			
		case xPath:return driver.findElement(By.xpath(address));
			
		case css:return driver.findElement(By.cssSelector(address));
		
		}
		
		return null;
		
	}

	public List<WebElement> identifyElements(locators type, String address) {
		
		switch(type) {
		case id : return driver.findElements(By.id(address));
			
		case name : return driver.findElements(By.name(address));
			
		case className: return driver.findElements(By.className(address));
			
		case tagName:return driver.findElements(By.tagName(address));
			
		case linkedText: return driver.findElements(By.linkText(address));
			
		case partialLinkedText:return driver.findElements(By.partialLinkText(address));
			
		case xPath:return driver.findElements(By.xpath(address));
			
		case css:return driver.findElements(By.cssSelector(address));
		
		}
		
		return null;	
		
	}

}
