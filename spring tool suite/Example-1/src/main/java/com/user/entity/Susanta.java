package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "susantas")
public class Susanta {
	@Id
	@GeneratedValue
private Long id;
private String name;
public Susanta(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Susanta() {
	super();
}

}
