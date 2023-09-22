package org.example;

public class SnookerPlayer {
    private String name, nationality;
    private int gamesPlayed, wins;
    private double moneyWon;

    public SnookerPlayer(String name, String nationality, int gamesPlayed, int wins, double moneyWon) {
        this.name = name;
        this.nationality = nationality;
        this.gamesPlayed = gamesPlayed;
        this.wins = wins;
        this.moneyWon = moneyWon;
    }
    public SnookerPlayer() {
        this.name = "Unnamed";
        this.nationality = "Unknown";
        this.gamesPlayed = 0;
        this.wins = 0;
        this.moneyWon = 0.0;
    }

    public void increasePrizeMoney(double increaseBy){
        this.moneyWon += increaseBy;
    }
    public void increasePrizeMoney(){
        this.moneyWon ++;
    }

    public void updatePerformance(boolean hasWonLastGame){
        this.gamesPlayed ++;
        if (hasWonLastGame) {
            this.wins ++;
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public double getMoneyWon() {
        return moneyWon;
    }

    public void setMoneyWon(double moneyWon) {
        this.moneyWon = moneyWon;
    }

    @Override
    public String toString() {
        return "SnookerPlayer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                ", wins=" + wins +
                ", moneyWon=€" + moneyWon +
                '}';
    }
}
