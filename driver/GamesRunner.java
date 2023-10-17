package com.xworkz.september.driver;
import com.xworkz.september.things.Games;
public class GamesRunner {
	public static void main(String args[]) {
		Games games = new Games();
        games.onSave("Cricket");
        games.onSave("Hockey");
        games.onSave("FootBall");
        games.onSave("ThrowBall");
        games.onSave("BallBatmitton");
        games.onSave("Kabbaddi");
        games.getElement();
        games.update("Kabbaddi" ,"Kho - Kho");
        games.getElement();
        games.delete("ThrowBall");
        games.getElement();
	}

}
