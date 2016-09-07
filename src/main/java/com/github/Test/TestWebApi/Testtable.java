package com.github.Test.TestWebApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Testtable {
	@Id
	private Integer id;
	@Column
	private String value;
}
