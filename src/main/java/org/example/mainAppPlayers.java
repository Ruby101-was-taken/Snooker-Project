package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class mainAppPlayers {
    public static void main(String[] args) {
        SnookerPlayer[] players = {new SnookerPlayer("John Bloggs", "Irish", 5, 4, 50.00), new SnookerPlayer("Bill Lennon", "Irish", 15, 15, 300.00)};

        players[0].increasePrizeMoney(5);
        players[0].updatePerformance(true);

        for (SnookerPlayer player : players) {
            System.out.println(player.toString());
        }

        System.out.printf("%-15s\t%-15s\t%-15s%n", players[0].getName(), players[0].getGamesPlayed(), players[0].getWins());
    }
}