/*
 * @ (#) TestRectangle.java     1.0     8/28/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */
package iuh.fit.se;

/*
 * @author Nguyen Thanh Tuan
 * @version 1.0
 * @description This class represents a bank with many bank accounts
 * @created 8/28/2024 10:59 AM
 */
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle: " + rectangle.toString());

        scanner.close();
    }
}

