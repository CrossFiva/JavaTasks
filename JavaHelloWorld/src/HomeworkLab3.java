import java.awt.Point;

public class HomeworkLab3 {


    public static void main(String[] args1) {
        int col, rol;
        
        System.out.println("  * |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |");
        System.out.println(" ------------------------------------------------------");
        for (col = 1; col <= 10; col++) {

            System.out.printf("%3d |", col);
          for (rol = 1; rol <=10; rol++) {
            System.out.printf("%3d |", (col*rol));
          }
          System.out.println("\n ------------------------------------------------------");
        }

    }

}

