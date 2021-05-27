package com.github.welblade.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seletor {
    WebDriver driver;
    WebDriverWait wait;

    public Seletor(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void preencherCampo(final String seletorCSS, final String texto ){
        this.driver.findElement(By.cssSelector(seletorCSS)).clear();
        this.driver.findElement(By.cssSelector(seletorCSS)).sendKeys(texto);
    } 

    public void clicarEm(final String seletorCSS){
        this.driver.findElement(By.cssSelector(seletorCSS)).click();
    }

    public void esperarElemento(final String seletorCSS){
        this.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(seletorCSS)));
    }
}
