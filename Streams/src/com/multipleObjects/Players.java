package com.multipleObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
	public static void main(String args[]) {
		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith"); 
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad"); 
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori"); 
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf"); 
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan"); 
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad"); 
		
		List<List<String>> team = new ArrayList<>(); 
		team.add(teamIndia);
		team.add(teamAustralia);
		team.add(teamEngland);
		team.add(teamNewZeland); 
		team.add(teamSouthAfrica);
		team.add(teamWestIndies);
		team.add(teamSriLanka);
		team.add(teamPakistan); 
		
		team.stream().flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(s -> System.out.println(s));
	}

	
}
