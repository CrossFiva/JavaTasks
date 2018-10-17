
import java.util.*;

public class Rectangle extends Shape {
  private double mWide;
  private double mHigh;

  Rectangle (double wide, double high) {
    this.mWide = wide; // update radius from input.
    this.mHigh = high;
  }

  protected  double perimeter () {
    return 2 * (mWide + mHigh);
  }
  protected double area () {

    return mHigh * mWide;
  }

  public String toString () {

    return "Rectangle("+mWide+','+mHigh+')';
  }

}