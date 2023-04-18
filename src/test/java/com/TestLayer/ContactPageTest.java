package com.TestLayer;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.ContactPage;
import com.UtilsLayer.UtilsClass;

import junit.framework.Assert;

public class ContactPageTest extends BaseClass {

	public ContactPage contactpage;

	@BeforeClass
	public void setUp() throws Exception {
		BaseClass.initialization();
	}

	@Test(priority = 1)
	public void testContactPage() {
		contactpage = new ContactPage();
		String expectedTitle = "Contact Us - IntelligenceBank";
		Assert.assertEquals(contactpage.contactPage(), expectedTitle);

	}

	@Test(priority = 2)
	public void verifyCompanyName() {
		Assert.assertEquals(contactpage.getCompanyName().isDisplayed(), true);
		Assert.assertEquals(contactpage.getCompanyName().isEnabled(), true);
		contactpage.enterCompanyName("Patona");
	}

	@Test(priority = 3)
	public void verifyFirstName() {
		Assert.assertEquals(contactpage.getFirstName().isDisplayed(), true);
		Assert.assertEquals(contactpage.getFirstName().isEnabled(), true);
		contactpage.enterFirstName("Prajyot");
	}

	@Test(priority = 4)
	public void verifyLastName() {
		Assert.assertEquals(contactpage.getLastName().isDisplayed(), true);
		Assert.assertEquals(contactpage.getLastName().isEnabled(), true);
		contactpage.enterLastName("Kamble");
	}

	@Test(priority = 5)
	public void verifyWorkMail() {
		Assert.assertEquals(contactpage.getWorkEmail().isDisplayed(), true);
		Assert.assertEquals(contactpage.getWorkEmail().isEnabled(), true);
		contactpage.enterWorkMail("prajyot@gmail.com");
	}

	@Test(priority = 6)
	public void verifyPhone() {
		Assert.assertEquals(contactpage.getPhone().isDisplayed(), true);
		Assert.assertEquals(contactpage.getPhone().isEnabled(), true);
		contactpage.enterPhone("7878787878");
	}

	@Test(priority = 7)
	public void verifyCountry() {
		Assert.assertEquals(contactpage.getCountry().isDisplayed(), true);
		Assert.assertEquals(contactpage.getCountry().isEnabled(), true);
		contactpage.enterCountry("India");
	}

	@Test(priority = 8)
	public void veryfyEnquiryDetails() {
		Assert.assertEquals(contactpage.getEnquiryBox().isDisplayed(), true);
		Assert.assertEquals(contactpage.getEnquiryBox().isEnabled(), true);
		contactpage.enterEnquiryBox("IT Industriy");
	}

	@Test(priority = 9)
	public void verifyAboutUs() {
		Assert.assertEquals(contactpage.getAboutUs().isDisplayed(), true);
		Assert.assertEquals(contactpage.getAboutUs().isEnabled(), true);
		contactpage.enterAboutUsInfo("Webinar");
	}

	@Test(priority = 10)
	public void clickOnCheck() {
		contactpage.clickOnCheckBox();
	}

	@Test(priority = 11)
	public void takeSS() {
		try {
			UtilsClass.takeScreenShot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
