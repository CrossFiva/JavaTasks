

import java.awt.Point;

public class Week04 {
    
    private static String Password ="Mine Password";
    private static final int DAYS_PER_WEEK = 7;

    public static void main(String[] args1) {
      MoveCar();
      System.out.println( Week04.Password);
    }

    public static void MoveCar () {
        Point p1 = new Point(5,5);  
        Point p2 = p1;  
        System.out.println("p1 is : " + p1);  
        System.out.println("p2 is : " + p2);  
          
        p1.x = 500;
        p2.x = 500;
        
        System.out.println("p1 is : " + p1);  
        System.out.println("p2 is : " + p2);  

    }

}