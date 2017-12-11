package com.assessoria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reinvidicacao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(columnDefinition="text")
	private String reinvidicacao;
}
