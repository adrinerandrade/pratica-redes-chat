package model;

public class Player {

    private int userId;
    private GameStatus status;

    public Player(int userId, GameStatus status) {
        this.userId = userId;
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

}
