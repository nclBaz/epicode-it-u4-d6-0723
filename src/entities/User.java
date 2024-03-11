package entities;

import exceptions.InvalidStringException;

public class User {
	private String name;
	private String surname;

	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidStringException {
		if(name.length() <= 2) throw new InvalidStringException(name);
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
