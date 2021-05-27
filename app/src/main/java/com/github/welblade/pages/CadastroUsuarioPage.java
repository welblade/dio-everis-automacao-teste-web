package com.github.welblade.pages;

import com.github.welblade.helpers.Seletor;

import org.openqa.selenium.WebDriver;

public class CadastroUsuarioPage {

    private WebDriver driver;
    private Seletor seletor;

    public CadastroUsuarioPage(WebDriver driver){
        this.driver = driver;
        this.seletor = new Seletor(driver);
    }

    public void cadastrar(){
        driver.get("http://automationpractice.com");

        seletor.clicarEm("#header > div.nav > div > div > nav > div.header_user_info > a");
        seletor.esperarElemento("#SubmitCreate");
        seletor.preencherCampo("#email_create", "jao.02@digitalinovation.one");
        
        seletor.clicarEm("#SubmitCreate");
        seletor.esperarElemento("#id_gender1");

        seletor.clicarEm("#id_gender1");
        seletor.preencherCampo("#customer_firstname", "Joao");
        seletor.preencherCampo("#customer_lastname", "das Rodas");
        seletor.preencherCampo("#passwd", "_senha_");
        seletor.clicarEm("#days > option:nth-child(3)");
        seletor.clicarEm("#months > option:nth-child(5)");
        seletor.clicarEm("#years > option:nth-child(23)");
        seletor.preencherCampo("#firstname", "Eumesmo");
        seletor.preencherCampo("#lastname", "Sobrenome de Alguem");
        seletor.preencherCampo("#company", "My Company LTDA.");
        seletor.preencherCampo("#address1", "Rua alguma coisa de tal");
        seletor.preencherCampo("#address2", "numero 66");
        seletor.clicarEm("#id_country > option:nth-child(2)");
        seletor.preencherCampo("#city", "Cubatão");
        seletor.clicarEm("#id_state > option:nth-child(18)");
        seletor.preencherCampo("#postcode", "99999");
        seletor.preencherCampo("#other", "#OTHER");
        seletor.preencherCampo("#phone", "999999999");
        seletor.preencherCampo("#phone_mobile", "999999999");
        seletor.preencherCampo("#alias", "teste.02@teste.com.br");
        seletor.clicarEm("#submitAccount");
    }
    
}