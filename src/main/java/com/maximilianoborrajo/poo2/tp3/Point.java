/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

/**
 *
 * @author maxim
 */
public class Point {

	private double x = 0;
	private double y = 0;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	public Point sum(Point point) {
		double x = this.getX() + point.getX();
		double y = this.getY() + point.getY();
		
		return new Point(x, y);
	}
}