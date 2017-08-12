package com.vimal;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
	private String name;
	private int hitpoints;
	private int strength;

	public Monster(String name, int hitpoints, int strength) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
		this.strength = strength;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", hitpoints=" + hitpoints + ", strength=" + strength+"]";
	}
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0,this.name);
		values.add(1, ""+this.hitpoints);
		values.add(2, ""+this.strength);
		return values;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues!=null && savedValues.size()>0){
			this.name = savedValues.get(0);
			this.hitpoints= Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		
		}
		
	}
	

}
