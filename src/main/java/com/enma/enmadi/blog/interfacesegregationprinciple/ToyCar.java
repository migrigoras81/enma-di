/**
 * 
 */
package com.enma.enmadi.blog.interfacesegregationprinciple;

/**
 * 
 */
public class ToyCar implements Toy, Movable {
	
	double price;
	String color;

	@Override
	public void move() {
		System.out.println("ToyCar: start moving car");
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ToyCar Moveable Toy car - [price=" + price + ", color=" + color + "]";
	}

	
}
