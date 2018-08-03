import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        function1(32);
    }
    public static boolean function1 (int a) {
        Scanner Scn1 = new Scanner(System.in);
        String temp01;

        temp01 = "";

        String str1 = "BBCCDDD DDddddDD";
        System.out.println("a = "+ str1.length());
        temp01 = Scn1.nextLine();
        
        System.out.printf("Temp01 = %s\n", temp01);

        Scn1.close();
    	return true;
    }  

}
