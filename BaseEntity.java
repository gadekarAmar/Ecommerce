package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
//checking git
//common super class for all entities
@MappedSuperclass
/*
 
 * Meaning : Class level annotation to specify to hibernate : it's common base
 * class --entities can extend from it . no table associated.
 */
@Getter
@Setter
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	

}
