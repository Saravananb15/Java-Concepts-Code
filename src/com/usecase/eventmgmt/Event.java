package com.usecase.eventmgmt;

public class Event extends EMbase{
	public String description;
	public String startTime;
	public String endTime;
	public Boolean started;

	public Event(Long id, String name ,String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
