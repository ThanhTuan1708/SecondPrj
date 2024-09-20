/*
 * @ (#) Rectangle.java     1.0     8/28/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */
package iuh.fit.se;

/*
 * @author Nguyen Thanh Tuan
 * @version 1.0
 * @description This class represents a bank with many bank accounts
 * @created 8/28/2024 10:58 AM
 */
public class Rectangle {

    private double length;
    private double width;

    // Constructors
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    // Calculate Area
    public double getArea() {
        return length * width;
    }

    // Calculate Perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
