package org.example;
import java.util.ArrayList;
public class Tournament {
    private String name;
    private double totalPrizeMoney;
    private ArrayList<SnookerPlayer> players;

    public Tournament(String name, double totalPrizeMoney) {
        this.name = name;
        this.totalPrizeMoney = totalPrizeMoney;
        this.players = new ArrayList<SnookerPlayer>();
    }
    public Tournament(String name) {
        this.name = name;
        this.totalPrizeMoney = 0.0;
        this.players = new ArrayList<SnookerPlayer>();
    }

    public void viewPerformance(){
        for (SnookerPlayer player : players){
            String formatString = String.format("%-15s\t%-15s\t%-15s%n", player.getName(), player.getGamesPlayed(), player.getWins());
            for (int i=0; i < formatString.length(); i++){
                System.out.print('=');
            }
            System.out.println("\n" + formatString);
        }
    }
    public void IncreaseAll(double money) {
        for (SnookerPlayer player: players){
            player.increasePrizeMoney(money);
        }
    }
    public void IncreaseAll() {
        for (SnookerPlayer player: players){
            player.increasePrizeMoney(1);
        }
    }

    @Override
    public String toString() {
        String returnString = "Tournament{" +
                "name='" + name + '\'' +
                ", totalPrizeMoney=" + totalPrizeMoney +
                ", players=" + players +
                '}';

        for (SnookerPlayer player : this.players){
            returnString += "\n" + player.toString();
        }

        return returnString;
    }
}
