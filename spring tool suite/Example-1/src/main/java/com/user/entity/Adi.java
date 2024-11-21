package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "adis")
public class Adi {
	@Id
	@GeneratedValue
private Long id;
private String name;
public Adi(long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Adi() {
	super();
}


}
