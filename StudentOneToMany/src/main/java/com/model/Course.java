package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity annotation marks this class as an entity.
@Entity
//@Table annotation specifies the table name where data of this entity is to be persisted.
@Table(name = "courses")
public class Course 
{
	//@Id annotation marks the identifier for this entity.
	@Id
	//Provides for the specification of generation strategies for the values of primary keys.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column annotation specifies the details of the column for this property or field.
	@Column(name = "course_id")
	private int id;
	
	//@Column annotation specifies the details of the column for this property or field.
	@Column(name = "course_name")
	private String name;
	
	//one-to-many mapping means that one row in a table is mapped to multiple rows in another table.
	//Here one course can have many students
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Student> stud = new ArrayList<Student>();

	//Creating parameterized constructor
	public Course(int id, String name, List<Student> stud) {
		super();
		this.id = id;
		this.name = name;
		this.stud = stud;
	}

	//Creating Super class constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Creating getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}	
}
