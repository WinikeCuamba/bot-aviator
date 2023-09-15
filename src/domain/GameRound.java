package domain;


public class GameRound {
    private float finishTime;
    private short gameNumber;
    public float[] many = new float[2];

    public GameRound(float finishTime, float[] many, short gameNumber) {
        this.finishTime = finishTime;
        this.many = many;
        setGameNumber(gameNumber);
    }

    public void setGameNumber(short gameNumber) {
        if ((gameNumber != 1) || (gameNumber != 2)) {
            return;
        }

        this.gameNumber = gameNumber;
    }

    public float getFinishTime() {
        return this.finishTime;
    }

    public short getGameNumber() {
        return this.gameNumber;
    }

}
