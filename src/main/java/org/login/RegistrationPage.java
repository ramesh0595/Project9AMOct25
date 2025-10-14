package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass{

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createAccount;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="websubmit")
	private WebElement signup;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSignup() {
		return signup;
	}
	
	
}
