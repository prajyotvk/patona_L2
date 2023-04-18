package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.HandleDropDown;
import com.UtilsLayer.UtilsClass;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//form[@id='pardot-form']/div[1]/input[@name='Companypi_Company']")
	private WebElement CompanyName;

	@FindBy(xpath = "//form[@id='pardot-form']/div[2]/input[@name='First_Namepi_First_Name']")
	private WebElement FirstName;

	@FindBy(xpath = "//form[@id='pardot-form']/div[3]/input[@id='Last_Namepi_Last_Name']")
	private WebElement LastName;

	@FindBy(xpath = "//label[text()='First Name*']/following::input[3]")
	private WebElement WorkEmail;

	@FindBy(xpath = "//form[@id='pardot-form']/div[5]/input[@id='941293_138982pi_941293_138982']")
	private WebElement Phone;

	@FindBy(xpath = "//form[@id='pardot-form']/div[6]/select[@id='941293_138980pi_941293_138980']")
	private WebElement Country;

	@FindBy(xpath = "//form[@id='pardot-form']/div[7]/textarea")
	private WebElement EnquiryBox;

	@FindBy(xpath = "//form[@id='pardot-form']/div[8]/select")
	private WebElement AboutUs;

	@FindBy(xpath = "//label[text()='First Name*']/following::input[6]")
	private WebElement CheckBox;
	
	@FindBy(xpath = "//label[text()='First Name*']/following::input[@type='submit']")
	private WebElement contctBtn;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public String contactPage() {

		return driver.getTitle();
	}

	public WebElement getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(WebElement companyName) {
		CompanyName = companyName;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}

	public WebElement getWorkEmail() {
		return WorkEmail;
	}

	public void setWorkEmail(WebElement workEmail) {
		WorkEmail = workEmail;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public void setPhone(WebElement phone) {
		Phone = phone;
	}

	public WebElement getCountry() {
		return Country;
	}

	public void setCountry(WebElement country) {
		Country = country;
	}

	public WebElement getEnquiryBox() {
		return EnquiryBox;
	}

	public void setEnquiryBox(WebElement enquiryBox) {
		EnquiryBox = enquiryBox;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}

	public void setAboutUs(WebElement aboutUs) {
		AboutUs = aboutUs;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public void setCheckBox(WebElement checkBox) {
		CheckBox = checkBox;
	}

	public WebElement getContctBtn() {
		return contctBtn;
	}

	public void setContctBtn(WebElement contctBtn) {
		this.contctBtn = contctBtn;
	}

	public void enterCompanyName(String value) {
		UtilsClass.enterDataInTextBox(CompanyName, value);
	}

	public void enterFirstName(String value) {
		UtilsClass.enterDataInTextBox(FirstName, value);
	}

	public void enterLastName(String value) {
		UtilsClass.enterDataInTextBox(LastName, value);
	}

	public void enterWorkMail(String value) {
		UtilsClass.enterDataInTextBox(WorkEmail, value);
	}

	public void enterPhone(String value) {
		UtilsClass.enterDataInTextBox(Phone, value);
	}

	public void enterCountry(String value) {
		HandleDropDown.selectValueUsingVisibleText(Country, value);
	}

	public void enterEnquiryBox(String value) {
		UtilsClass.enterDataInTextBox(EnquiryBox, value);
	}

	public void enterAboutUsInfo(String value) {
		HandleDropDown.selectValueUsingVisibleText(AboutUs, value);
	}

	public void clickOnCheckBox() {
		UtilsClass.click(CheckBox);
	}

}
