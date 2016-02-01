/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author Nicholas
 */
public class CircleCalc {
    private String radius;
    private final double PI = Math.PI;

    public CircleCalc(String radius) {
        this.radius = radius;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }
    
    public double CalculateArea(){
        return PI * Double.parseDouble(radius) * Double.parseDouble(radius);
    }
}
