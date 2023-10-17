package com.xworkz.september.things;

public class Game {
	public static void getGameInformation(String name,int numOfPlayers) {
		System.out.println("Name of the game is:" +name);
		System.out.println("Number of players in game:"+numOfPlayers);
	}
	public static String getNameOfGame() {
		System.out.println("Name of the game");
		return "LUDO";
	}
	public static boolean inDoorGame(String gameName) {
	if(gameName=="LUDO") {
		System.out.println("It is indoor Game");
	}else {
		System.out.println("It is not indoor Game");
	}
	return true;	
	}

}
