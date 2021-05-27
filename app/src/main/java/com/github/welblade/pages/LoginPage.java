package com.github.welblade.pages;

import com.github.welblade.helpers.Seletor;

import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private Seletor seletor;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.seletor = new Seletor(driver);
    }

    public void login(){
        driver.get("http://automationpractice.com");

        seletor.clicarEm("#header > div.nav > div > div > nav > div.header_user_info > a");
        seletor.esperarElemento("#SubmitLogin");

        seletor.preencherCampo("#email", "jao.02@digitalinovation.one");
        seletor.preencherCampo("#passwd", "_senha_");

        seletor.clicarEm("#SubmitLogin");
    }

    public Seletor getSeletor(){
        return this.seletor;
    }
    public WebDriver getDriver(){
        return this.driver;
    }
    
}