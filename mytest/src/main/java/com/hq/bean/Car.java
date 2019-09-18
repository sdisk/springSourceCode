package com.hq.bean;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-18 16:43
 **/
public class Car {

	private int maxSpeed;
	private String brand;
	private double price;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" + "maxSpeed=" + maxSpeed + ", brand='" + brand + '\'' + ", price=" + price + '}';
	}
}
