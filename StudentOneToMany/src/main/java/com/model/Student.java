package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity annotation marks this class as an entity.
@Entity
//@Table annotation specifies the table name where data of this entity is to be persisted.
@Table(name = "student")
public class Student 
{
	//@Id annotation marks the identifier for this entity.
	@Id
	//Provides for the specification of generation strategies for the values of primary keys.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column annotation specifies the details of the column for this property or field.
	@Column(name = "stud_id")
	private int id;
	
	//@Column annotation specifies the details of the column for this property or field.
	@Column(name = "stud_name")
	private String name;
	
	//@ManyToOne annotation lets us create bidirectional relationships too.
	//Here many students are assigned to one course
	@ManyToOne
	//It is used to specify the mapping of a foreign key column in a relationship between two entities.
	@JoinColumn(name = "course_id")
	private Course course;

	//Creating Super class constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Creating parameterized constructor
	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}	
}
