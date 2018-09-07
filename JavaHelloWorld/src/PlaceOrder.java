import java.util.Scanner;


public class PlaceOrder {

    public static void main(String[] args1) { 
        int Quantity;
        double UintPrice;
        double TotalPrice;
        String ProdName;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantity: ");
        Quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Description: ");
        ProdName = scanner.nextLine();
      
        System.out.print("Unit price: ");
        UintPrice = scanner.nextDouble();

        TotalPrice = Quantity * UintPrice;

        System.out.println("Order for "+ Quantity +" "+ ProdName.toUpperCase());
        System.out.printf("Total price %14.2f\n", TotalPrice);
        scanner.close();
        return;
        
    }
}
