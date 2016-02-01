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
public class RectangleCalc {
    private String width;
    private String length;

    public RectangleCalc(String width, String length) {
        this.width = width;
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
    
    public String CalculateArea(){
        System.out.println("i got here");
        double width2 = Double.parseDouble(width);
        double length2 = Double.parseDouble(length);
        double answer = width2*length2;
        System.out.println(answer);
        return String.valueOf(answer);
    }
}
