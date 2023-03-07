package models;

import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable {

	// Atributos
	private String name;

	// Constructores
	public Movie() {}

	public Movie(String name) {
		this.name = name;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	// toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		return builder.toString();
	}

	// hashCode
	public int hashCode() {
		return Objects.hash(name);
	}

	// equals
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Movie other = (Movie) obj;
		return Objects.equals(name, other.name);
	}
}
