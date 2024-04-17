package com.epic.PageObject;

import com.epic.PageFactory.demoPageFactory;

public class LoginPO {

    public static LoginPO loginPage;
    public static LoginPO getLoginPO() {

        if(loginPage==null){
            loginPage=new LoginPO();
        }
        return loginPage;
    }

    //enter username
    public void enterUserName(String username){
        demoPageFactory.pf.usernameTXT.sendKeys(username);
    }

    //enter password
    public void enterPassword(String pwd){
        demoPageFactory.pf.passwordTXT.sendKeys(pwd);
    }

    //click login btn
    public void clickLoginBtn(){
        demoPageFactory.pf.loginBTN.click();
    }

    //verify page title
    public Boolean verifyTitle(){

        boolean title = demoPageFactory.pf.title.isDisplayed();;
        return title;
    }




}
