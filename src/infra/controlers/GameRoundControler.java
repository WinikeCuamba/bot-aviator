package infra.controlers;

import app.usesCases.AutomatorPlay;
import domain.GameRound;

public class GameRoundControler {
    private final GameRound _gameRound;
    private final AutomatorPlay _sel;
    private int playRounds = 0; 

    public GameRoundControler(GameRound gameRound, AutomatorPlay sel) {
        this._gameRound = gameRound;
        this._sel = sel;
    }

    public void Play(float playTime) {
        boolean win;
        do {
            win = this._sel.playRound(this._gameRound);
            if (!win) {
                int numberOfPlays = this._gameRound.getGameNumber();
                for (int i = 0; i < numberOfPlays; i++) {
                    this._gameRound.many[i] *= 2;
                }
                this._sel.setGameRound(this._gameRound);
            } 
            this.playRounds++;
        } while (this.playRounds >= playTime);

    }

}
