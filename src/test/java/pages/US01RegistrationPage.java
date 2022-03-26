package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US01RegistrationPage {

    public US01RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ssn")
    public WebElement ssnTextbox;

    @FindBy(id = "firstName")
    public WebElement firstnameTextbox;

    @FindBy(id = "lastName")
    public WebElement lastnameTextbox;

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextbox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextbox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration Saved']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public List<WebElement> errorMessageList;

    @FindBy(id = "details-button")
    public WebElement advancedButton;

    @FindBy(id = "proceed-link")
    public WebElement proceedButton;



}