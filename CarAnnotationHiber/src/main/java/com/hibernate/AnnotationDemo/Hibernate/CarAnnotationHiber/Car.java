package com.hibernate.AnnotationDemo.Hibernate.CarAnnotationHiber;

//import to specify the column mapping using @Column annotation
import javax.persistence.Column;
//import to specifies that the class is an entity
import javax.persistence.Entity;
//import to specifies the primary key of the entity
import javax.persistence.Id;

@Entity
public class Car {
	 // fields, getters and setters
	@Id
	private int carId;
	@Column
	private String carName;
	@Column
	private double cost;
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
