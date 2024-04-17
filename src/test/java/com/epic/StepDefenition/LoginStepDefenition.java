package com.epic.StepDefenition;

import com.epic.PageObject.LoginPO;
import com.epic.Utility.WebDriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginStepDefenition {

    @Given("I open Web URL as {string}")
    public void i_open_web_url_as(String url) {

        WebDriverHelper.getHelper().driverInitilization();
        WebDriverHelper.getHelper().openURL(url);
    }
    @Given("I enter username as {string}")
    public void i_enter_username_as(String user) throws InterruptedException{

        LoginPO.getLoginPO().enterUserName(user);
        Thread.sleep(2000);
    }

    @Given("I enter password as {string}")
    public void i_enter_password_as(String pwd) {

        LoginPO.getLoginPO().enterPassword(pwd);
    }
    @When("I click on login button")
    public void i_click_on_login_button() {

        LoginPO.getLoginPO().clickLoginBtn();

    }

    @Then("I verify page title")
    public void i_verify_page_title() {

        Boolean titleDisplayed=LoginPO.getLoginPO().verifyTitle();
        assertTrue(titleDisplayed);
    }



}
