package org.example;
//"2. Design a class for a basic shape. The class should have the following features:
//        - An instance variable for the shape's type (e.g. triangle, rectangle, circle).
//        - An instance variable for the shape's dimensions (e.g. side lengths for a triangle, length and width for a rectangle, radius for a circle).
//        - A constructor that allows the user to create a shape with a given type and dimensions.
//        - A method that calculates and returns the perimeter of the shape.
//        - A method that calculates and returns the area of the shape. "

import java.util.*;
public class BasicShape {
    String shapeType;
    double triangleLength1;
    double triangleLength2;
    double triangleLength3;
    double rectangleLength;
    double rectangleWidth;
    double circleRadius;
    double area;
    double perimeter;

    public static final double PiValue = 3.14;

    BasicShape(String shape,double triangleLength1,double triangleLength2,double triangleLength3){
        this.shapeType=shape;
        this.triangleLength1=triangleLength1;
        this.triangleLength2=triangleLength2;
        this.triangleLength3=triangleLength3;
    }
    BasicShape(String shape,double length,double width){
        this.shapeType=shape;
        this.rectangleLength=length;
        this.rectangleWidth=width;
    }
    BasicShape(String shape,double radius){
        this.shapeType=shape;
        this.circleRadius=radius;
    }
    public double trianglePerimeter(){
        perimeter=this.triangleLength1+this.triangleLength2+this.triangleLength3;
        return perimeter;
    }
    public double triangleArea(){
        double height=(this.triangleLength1*this.triangleLength2)/2;
        area=(0.5)*height*this.triangleLength3;
        return area;
    }
    public double circlePerimeter(){
        perimeter=2*PiValue*this.circleRadius;
        return perimeter;
    }
    public double circleArea(){
        area=PiValue*this.circleRadius*this.circleRadius;
        return area;
    }
    public double rectangleArea(){
        area=this.rectangleWidth*this.rectangleLength;
        return area;
    }
    public double rectanglePerimeter(){
        perimeter=(2*this.rectangleLength)+(2*this.rectangleWidth);
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shape;
        String decoration="-----------------------------------------------------";
        while(true) {

            System.out.println("1.Triangle \n 2.Rectangle \n 3.Circle\n");
            System.out.println("Enter the Type You Want :");
            shape = sc.nextLine();
            if(shape.equalsIgnoreCase("triangle")){
                System.out.println("Enter the length of first Side :");
                double triangleLength1=sc.nextDouble();
                System.out.println("Enter the Length of Second Side :");
                double triangleLength2=sc.nextDouble();
                System.out.println("Enter the Length of Third Side :");
                double triangleLength3=sc.nextDouble();
                BasicShape t=new BasicShape(shape,triangleLength1,triangleLength2,triangleLength3);
                System.out.println("\nTriangle \n-------");
                System.out.println("Area of the Triangle :"+t.triangleArea());
                System.out.println("Perimeter of the Triangle :"+t.trianglePerimeter());
                System.out.println(decoration);
                sc.nextLine();
            }
            else if (shape.equalsIgnoreCase("rectangle")) {
                System.out.println("Enter the Length of the Rectangle :");
                double rectangleLength=sc.nextDouble();
                System.out.println("Enter the Width of the Rectangle :");
                double rectangleWidth=sc.nextDouble();
                BasicShape r=new BasicShape(shape,rectangleLength,rectangleWidth);
                System.out.println("\n Rectangle\n---------");
                System.out.println("Area of the Rectangle :"+r.rectangleArea());
                System.out.println("Perimeter of the Rectangle :"+r.rectanglePerimeter());
                System.out.println(decoration);

                sc.nextLine();

            }
            else if (shape.equalsIgnoreCase("Circle")) {
                System.out.println("Enter the Radius of the Circle :");
                double circleRadius=sc.nextDouble();
                BasicShape c=new BasicShape(shape,circleRadius);
                System.out.println("\n Circle \n------");
                System.out.println("Area of the Circle :" +c.circleArea());
                System.out.println("Perimeter of the Circle :"+c.circlePerimeter());
                System.out.println(decoration);

                sc.nextLine();
            }
            else {
                System.out.println("Wrong shape !");
                System.out.println(decoration);

            }
        }


    }
}
