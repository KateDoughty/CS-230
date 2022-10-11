package com.gamingroom;

/**
 * Class to hold attributes inherited by game, team, and player classes
 * 
 * @author Kate Doughty
 */
	
public class Entity {

	//make sure all entities have id and name
	protected long id;
	protected String name;
	
	//protect default constructor
	protected Entity() {}
	
	//constructor
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//allow returning id and name
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Entity [id = " + id + ", name = " + name + "]"; 
	}
}
