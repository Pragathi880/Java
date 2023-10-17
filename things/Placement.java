package com.xworkz.september.things;

public class Placement {
	public static void rounds() {
	System.out.println("This placement contain 4 rounds");
	}
	public static void rounds(int numberOfRounds) {
		System.out.println("This placement contain:"+ numberOfRounds);
		}
	public static void rounds(int numberOfRounds,String nameOfRound) {
		System.out.println("This placement contains"+numberOfRounds+"  "+nameOfRound);
		}
	public static void rounds(int numberOfRounds,String nameOfRound,String nameOfCandidate) {
		System.out.println("This placement contains"+numberOfRounds+"  "+nameOfRound+"  "+nameOfCandidate);
		}
	public static void rounds(String nameOfRound,int numberOfRounds,String nameOfCandidate) {
		System.out.println("This placement contains"+nameOfRound+"  "+numberOfRounds+"  "+nameOfCandidate);
		}
	
}
