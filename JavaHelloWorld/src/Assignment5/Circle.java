
import java.util.*;

public class Circle extends Shape {
  private double mRadius;

  Circle (double radius) {
    this.mRadius = radius; // update radius from input.
  }

  protected  double perimeter () {
    return 2 * mRadius * Math.PI;
  }
  protected double area () {

    return Math.PI * Math.pow(mRadius, 2);
  }
  public String toString () {

    return "Circle("+ mRadius +')';
  }
}