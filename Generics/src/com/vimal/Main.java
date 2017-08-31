package com.vimal;

public class Main {

	public static void main(String[] args) {
	
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
		System.out.println(adelaideCrows.numPlayer());
		
		Team<BaseballPlayer> bTeam = new Team<>("Chicago Cubs");
		bTeam.addPlayer(pat);
		
		Team<SoccerPlayer> sTeam = new Team<>("Manchester");
		sTeam.addPlayer(beckham);
		
		Team<SoccerPlayer> sTeam2 = new Team<>("Arsenal");
		sTeam.addPlayer(ronaldo);
		
		sTeam.matchResult(sTeam2, 3, 2);
		
		System.out.println("Rankings");
		System.out.println(sTeam.getName()+": "+ sTeam.ranking());
		System.out.println(sTeam2.getName()+": "+ sTeam2.ranking());
	
		System.out.println(sTeam.compareTo(sTeam2));
	}

}
