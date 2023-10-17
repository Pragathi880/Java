package com.xworkz.september.driver;

import com.xworkz.september.things.Game;

public class GameRunner {
	public static void main(String args[]) {
		Game.getNameOfGame();
		Game.getGameInformation("LUDO", 6);
		System.out.println("Name of the Game:"+"   "+Game.getNameOfGame());
		Game.inDoorGame("LUDO");
		System.out.println("It is indoor game:"+"   " +Game.inDoorGame(" "));
	}

}
