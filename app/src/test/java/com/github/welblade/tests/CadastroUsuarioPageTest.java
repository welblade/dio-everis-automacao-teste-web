package com.github.welblade.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.welblade.pages.CadastroUsuarioPage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@TestInstance(Lifecycle.PER_CLASS)
public class CadastroUsuarioPageTest {
    private WebDriver driver;
    

    @BeforeAll
    public void inicializar(){
        this.driver = new FirefoxDriver();
    }

    @Test
    public void testarCadastrarUsuarioPage(){
        CadastroUsuarioPage page = new CadastroUsuarioPage(this.driver);
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        
        page.cadastrar();

        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.cssSelector("a[title='Orders'] span")
        ));
        WebElement validaTexto = driver.findElement(
            By.cssSelector("a[title='Orders'] span")
        );
        assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
    }

    @AfterAll
    public void finalizar(){
        if(this.driver != null){
            this.driver.close();
            this.driver = null;
        }
    }
}
