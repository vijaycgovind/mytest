package com.champ.springTest.model;

import java.util.List;

public class Course {

	private String id;
	private String name;
	private String description;
	//private List<String> steps;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param steps
	 */
	public Course(String id, String name, String description, List<String> steps) {
		
		this.id = id;
		this.name = name;
		this.description = description;
	//	this.steps = steps;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	/*
	public List<String> getSteps() {
		return steps;
	}
	*/
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
/*
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", steps=" + steps + "]";
	}
*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		//result = prime * result + ((steps == null) ? 0 : steps.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
	/*	if (steps == null) {
			if (other.steps != null)
				return false;
		} else if (!steps.equals(other.steps))
			return false; */
		return true;
	}

	
	
	
	
}
