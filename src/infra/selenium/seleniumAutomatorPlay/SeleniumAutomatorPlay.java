package infra.selenium.seleniumAutomatorPlay;

import app.usesCases.AutomatorPlay;
import domain.GameRound;
import infra.selenium.Selenium;
import infra.selenium.SingletonSelenium;

public class SeleniumAutomatorPlay implements AutomatorPlay {
    private final String URL = "https://www.elephantbet.co.mz/aviator/";
    
    private final String[] ManyInputs = new String[] {"div[class='first-row auto-game-feature auto-game'] input[type='text']", "app-bet-control[class='bet-control double-bet ng-star-inserted'] div[class='first-row auto-game-feature'] input[type='text']"};
    private final String ManyButton = "app-bet-control[class='bet-control double-bet'] span[class='d-flex flex-column justify-content-center align-items-center']";
    private final String ButtonAutoSack = "app-bet-control[class='bet-control double-bet'] button[class='tab ng-star-inserted active']";
    private GameRound gameRound;
    private Selenium sel;
// 
// 
    public SeleniumAutomatorPlay() {
        this.sel = new SingletonSelenium().getInstance();
        this.sel.navigate(URL);
    }

    @Override
    public boolean playRound(GameRound gameRound) {
        try {
            this.gameRound = gameRound;
            this.sel.clickWithClassName(ButtonAutoSack);
            this.sel.sendKeysForInputWithClassName( Float.toString(this.gameRound.many[0]), ManyInputs[0]);
            this.sel.clickWithClassName(ManyButton);
        } catch (Exception e) {
            throw  e;
        }
        return true;
    }

    @Override
    public void setGameRound(GameRound gameRound) {
        this.gameRound = gameRound;
    }

}
