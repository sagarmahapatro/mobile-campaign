package org.adalyist.rest.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
	// ==============
	// PRIVATE FIELDS
	// ==============

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Size(min = 3, max = 80)
	private String email;

	@NotNull
	@Size(min = 2, max = 80)
	private String name;

	// ==============
	// PUBLIC METHODS
	// ==============

	public User() {
	}

	public User(long id) {
		this.id = id;
	}

	// getter and setter methods ...
}
