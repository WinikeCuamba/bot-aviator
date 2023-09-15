package infra.selenium.seleniumAutomatorPlay;

import app.usesCases.AutomatorPlay;
import domain.GameRound;

public class SeleniumAutomatorPlay implements AutomatorPlay{
    private GameRound gameRound;

    @Override
    public boolean playRound(GameRound gameRound) {
        this.gameRound = gameRound;
        return false;
    }

    @Override
    public void setGameRound(GameRound gameRound) {
        this.gameRound = gameRound; 
    }

}
