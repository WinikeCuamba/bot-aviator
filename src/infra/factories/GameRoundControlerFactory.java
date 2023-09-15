package infra.factories;

import app.usesCases.AutomatorPlay;
import domain.GameRound;
import infra.controlers.GameRoundControler;
import infra.selenium.seleniumAutomatorPlay.SeleniumAutomatorPlay;

public class GameRoundControlerFactory {
    private static GameRoundControler gameRoundControler;
    private static GameRound gameRound;
    private static AutomatorPlay automatorPlay;

    private GameRoundControlerFactory(GameRound gameRound) {}

    public static GameRoundControler createInstance() {
        automatorPlay = new SeleniumAutomatorPlay();
        float[] list = new float[] {2, 1};
        gameRound = new GameRound(2, list, (short) 1);
        gameRoundControler = new GameRoundControler(gameRound, automatorPlay);
        return gameRoundControler;
    }

}