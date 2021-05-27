package com.github.welblade.pages;

import com.github.welblade.helpers.Seletor;

import org.openqa.selenium.WebDriver;

public class CadastroEnderecoPage {

    private WebDriver driver;
    private Seletor seletor;

    public CadastroEnderecoPage(WebDriver driver){
        LoginPage page = new LoginPage(driver);

        page.login();

        this.seletor = page.getSeletor();
        this.driver = page.getDriver();
    }

    public void cadastrar(){
        seletor.clicarEm("#center_column > div > div:nth-child(1) > ul > li:nth-child(3) > a");
        seletor.esperarElemento("#center_column > div.addresses");

        seletor.clicarEm("#center_column > div.clearfix.main-page-indent > a");
        seletor.esperarElemento("#address1");

        seletor.preencherCampo("#address1", "Rua dos Bobos");
        seletor.preencherCampo("#address2", "N. 0");
        
        seletor.clicarEm("#id_country > option");
        seletor.clicarEm("#id_state > option:nth-child(4)");

        seletor.preencherCampo("#city", "Cubatão");
        seletor.preencherCampo("#phone", "9999999");
        seletor.preencherCampo("#phone_mobile", "9999999");
        seletor.preencherCampo("#other", "#other");
        seletor.preencherCampo("#alias", "Novo Endereço 001");
        seletor.preencherCampo("#postcode", "99999");

        seletor.clicarEm("#submitAddress");
    }

    public Seletor getSeletor(){
        return this.seletor;
    }
    
}