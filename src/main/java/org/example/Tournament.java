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

    public void addPlayer(SnookerPlayer playerToAdd){
        this.players.add(playerToAdd);
    }

    public void viewPerformance(){
        for (SnookerPlayer player : players){
            String formatString = String.format("%-15s\t%-15s\t%-15s%n", player.getName(), player.getGamesPlayed(), player.getWins());
            for (int i=0; i < formatString.length(); i++){
                System.out.print('=');
            }
            System.out.printf("%-15s\t%-15s\t%-15s%n", "\nName", "GamesPlayed", "Wins");
            System.out.println("\n" + formatString);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrizeMoney() {
        return totalPrizeMoney;
    }

    public void setTotalPrizeMoney(double totalPrizeMoney) {
        this.totalPrizeMoney = totalPrizeMoney;
    }

    public ArrayList<SnookerPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<SnookerPlayer> players) {
        this.players = players;
    }

    public double getTotalMoney(){
        double total = 0;
        for (SnookerPlayer player: players) {
            total += player.getMoneyWon();
        }
        return total;
    }

    public void IncreaseAll(double money) {
        for (SnookerPlayer player: players){
            player.increasePrizeMoney(money);
            this.totalPrizeMoney-=money;
        }
    }
    public void IncreaseAll() {
        for (SnookerPlayer player: players){
            player.increasePrizeMoney(1);
            this.totalPrizeMoney-=1;
        }
    }

    public ArrayList<SnookerPlayer> sortPlayers(){
        ArrayList<SnookerPlayer> playersSorted = new ArrayList<SnookerPlayer>();
        ArrayList<SnookerPlayer> playersUnsorted = new ArrayList<SnookerPlayer>();
        for (SnookerPlayer player:players) {
            playersUnsorted.add(player);
        }
        playersSorted.add(playersUnsorted.get(0));
        playersUnsorted.remove(0);
        while(playersUnsorted.size()>0){
            int indexToAdd = 0;
            for (SnookerPlayer player:playersSorted) {
                if (player.getWinPercent() > playersUnsorted.get(0).getWinPercent()){
                    indexToAdd+=1;
                }
            }
            playersSorted.add(indexToAdd, playersUnsorted.get(0));
            playersUnsorted.remove(0);

        }
        return playersSorted;
    }

    public void playerWins(int winnerIndex, int looserIndex){
        players.get(winnerIndex-1).updatePerformance(true);
        players.get(looserIndex-1).updatePerformance(false);
    }
    public void playerWins(String winnerName, String looserName){
        int winnerIndex = -1, looserIndex = -1;
        for(int i=0; i<players.size(); i++){
            if(players.get(i).getName().equalsIgnoreCase(winnerName)){
                winnerIndex=i;
            }
            else if(players.get(i).getName().equalsIgnoreCase(looserName)){
                looserIndex=i;
            }
        }
        if(winnerIndex!=-1 && looserIndex!=-1){
            players.get(winnerIndex).updatePerformance(true);
            players.get(looserIndex).updatePerformance(false);
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
