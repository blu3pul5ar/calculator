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
public class TriangleCalc {
    private String base,height;

    public TriangleCalc(String base, String height) {
        this.base = base;
        this.height = height;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    
    
    public double CalculateArea(){
        return (0.5 * Double.parseDouble(base) * Double.parseDouble(height));
    }
}
