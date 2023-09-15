package infra.selenium.seleniumAutomatorLogin;

import app.usesCases.AutomatorLogin;
import domain.User;
import infra.selenium.Selenium;


public class SeleniumAutomatorLogin implements AutomatorLogin {
    private final String  URL_LOGIN = "https://www.elephantbet.co.mz/#/";
    private final User user;
    private final Selenium sel;

    public SeleniumAutomatorLogin(User user) {
        this.user = user;
        this.sel = new Selenium();

    } 
    
    @Override
    public void login() {
       
        this.sel.navigate(URL_LOGIN);
        this.sel.clickWithId("onesignal-slidedown-cancel-button");
        this.sel.sendKeysForInput(this.user.getNumber(), "(//input[@id='username-login-form-oneline'])[1]");
        this.sel.sendKeysForInput(this.user.getSenha(), "(//input[@placeholder='Senha'])[1]");
        this.sel.clickWithXpath("(//button[@id='login-form-oneline'])[1]");

    }
    
    
}
