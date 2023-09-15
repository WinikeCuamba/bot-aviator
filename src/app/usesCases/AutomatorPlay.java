package app.usesCases;

import domain.GameRound;

public interface AutomatorPlay {
    public boolean playRound( GameRound gameRound );
    public void setGameRound(GameRound gameRound);

}
