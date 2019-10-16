package model;

public class User {

    private int id;
    private int userId;
    private int winCount;

    public User(int id, int userId, int winCount) {
        this.id = id;
        this.userId = userId;
        this.winCount = winCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWinNumber() {
        return winCount;
    }

    public void setWinNumber(int winNumber) {
        this.winCount = winNumber;
    }

}
