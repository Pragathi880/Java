package com.xworkz.september.driver;

import com.xworkz.september.things.Cricket;

public class CricketRunner {
	public static void main(String args[]) {
		Cricket.wicket();
		byte wick= Cricket.wicket();
		System.out.println("Wicket:"+wick);
		
		Cricket.scoreOfAPerson();
		int score=Cricket.scoreOfAPerson();
		System.out.println("Score:"+score);
		
		Cricket.totalScore();
		System.out.println("Total score :"+ Cricket.totalScore());
		
		Cricket.totalScoreOfAPersonInT20();
		System.out.println("Total score of a person :"+ Cricket.totalScoreOfAPersonInT20());
		
		Cricket.NumberOfOversCompleted();
		System.out.println("Tnumber of overs completed :"+ Cricket.NumberOfOversCompleted());
		
		Cricket.totalNumberOfOverPlayed();
		System.out.println("Total number of overs played"+ Cricket.totalNumberOfOverPlayed());
		
		Cricket.matchPlayed();
		System.out.println("Total  match played :"+ Cricket.matchPlayed());
		
		Cricket.nameOfPerson();
		System.out.println("name of a person :"+ Cricket.nameOfPerson());
		
		Cricket.Overs();
		System.out.println("Total overs :"+ Cricket.Overs());
		
		
	}

}
