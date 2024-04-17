package com.epic.PageFactory;

import com.epic.Utility.WebDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class demoPageFactory {
    public static demoPageFactory pf= PageFactory.initElements(WebDriverHelper.getDriver(), demoPageFactory.class);

    @FindBy(how= How.ID , using = "user-name")
    public WebElement usernameTXT;

    @FindBy(how= How.NAME , using = "password")
    public WebElement passwordTXT;

    @FindBy(how= How.CSS , using = "input.btn_action")
    public WebElement loginBTN;

    @FindBy(how= How.XPATH , using = "//div[@class='product_label']")
    public WebElement title;

}
