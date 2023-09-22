package org.example;

public class MainApp {
    public static void main(String[] args) {
        Tournament worldChampionship = new Tournament("World Championship", 3000000);
        worldChampionship.addPlayer(new SnookerPlayer("Joe The Bloggs", "Everywhere", 0, 0, 0));
        worldChampionship.addPlayer(new SnookerPlayer("Jumbo Josh", "Canadian", 0, 0, 0));
        worldChampionship.addPlayer(new SnookerPlayer("Walter, like Walter White from Breaking Bad", "New Mexico", 0, 0, 0));

        System.out.println(worldChampionship.toString());
        worldChampionship.IncreaseAll(10000);

        worldChampionship.playerWins(1,2);
        worldChampionship.playerWins(1,3);
        worldChampionship.playerWins(3,2);

        worldChampionship.viewPerformance();

        worldChampionship.addPlayer(new SnookerPlayer("Kermit, the Destroyer of Worlds", "Hell", 0, 0, 0));
        worldChampionship.playerWins(4,1);
        worldChampionship.playerWins(4,2);
        worldChampionship.playerWins("Kermit, the Destroyer of Worlds","Walter, like Walter White from Breaking Bad");

        worldChampionship.viewPerformance();
        System.out.println(worldChampionship.toString());

        System.out.println("UK TIME!?!??!?!?!?!??!!");

        Tournament ukMasters = new Tournament("UK Masters", 50000);
        ukMasters.addPlayer(new SnookerPlayer("King Charles (The Breed of dog not the guy)", "English", 0, 0, 30));
        ukMasters.addPlayer(new SnookerPlayer("David Johnson", "English", 0, 0, 2030));

        System.out.println(ukMasters.getTotalPrizeMoney() + " is the total prize money in " + ukMasters.getName());

        for (int i = 0; i<worldChampionship.sortPlayers().size(); i++) {
            System.out.println("Position " + (i+1) + ": " + worldChampionship.sortPlayers().get(i).toString());
        }

    }
}
