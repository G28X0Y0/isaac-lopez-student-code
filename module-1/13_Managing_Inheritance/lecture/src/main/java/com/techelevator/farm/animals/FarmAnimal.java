package com.techelevator.farm.animals;

import com.techelevator.farm.interfaces.Singable;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public String getSound( ) {
		return sound;
	}

	protected String aProtectedMethod(){
		return "This is a protected method.";
	}

}