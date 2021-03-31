package za.ac.cput;

/*
 * @Author: Thokozile Snono
 * Student number: 216032121
 * Date: 1 April 2021
 * This is the class for the shape which is a Circle and I will be testing it
 */

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

//    public double calculateArea(){
//        double a = 0;
//        a = radius * radius * 3.14;
//        return a;
//    }
//    public double calculateCircumference(){
////        double c = 0;
////        c = radius * 2 * 3.14;
////        return c;
//    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

//    //show
//    public void show(){
//        System.out.println("Radius: " +radius);
//    }

}

