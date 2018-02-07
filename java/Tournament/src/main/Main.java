package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.Team;
import rules.Rules;
import util.Util;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Team> teams = new Team().getListTeams();
		
		List<String> results = Arrays.asList("Allegoric Alaskans;Blithering Badgers;win", "Devastating Donkeys;Courageous Californians;draw", "Devastating Donkeys;Allegoric Alaskans;win", "Courageous Californians;Blithering Badgers;loss", "Blithering Badgers;Devastating Donkeys;loss", "Allegoric Alaskans;Courageous Californians;win");
		
		for(String result : results) {
			String[] resultArray = result.split(";");
			
			String Team1 = resultArray[0];
			String Team2 = resultArray[1];
			String gameResult = resultArray[2];
			
			Team t1 = new Team().getTeamByName(Team1, teams);
			Team t2 = new Team().getTeamByName(Team2, teams);
			
			new Rules().calculatePoints(t1, t2, gameResult);
		}

		System.out.println(Util.displayTournament(teams));
		
	}

}