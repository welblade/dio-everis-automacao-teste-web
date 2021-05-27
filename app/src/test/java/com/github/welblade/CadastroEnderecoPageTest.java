package com.github.welblade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.welblade.pages.CadastroEnderecoPage;

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
public class CadastroEnderecoPageTest {
    private WebDriver driver;
    

    @BeforeAll
    public void inicilizar(){
        this.driver = new FirefoxDriver();
    }

    @Test
    public void testarCadastroEnderecoPage(){
        CadastroEnderecoPage page = new CadastroEnderecoPage(this.driver);
        WebDriverWait wait = new WebDriverWait(this.driver, 5);

        page.cadastrar();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.cssSelector("#center_column > h1")
        ));
        WebElement validaTexto = driver.findElement(
            By.cssSelector("#center_column > h1")
        );
        assertEquals("MY ADDRESSES", validaTexto.getText());
    }

    @AfterAll
    public void finalizar(){
        if(this.driver != null){
            //this.driver.close();
            //this.driver = null;
        }
    }
}
