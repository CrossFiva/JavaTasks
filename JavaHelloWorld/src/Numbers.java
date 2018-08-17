
public class Numbers {

    public static void main(String[] args1) { 
        int Var1, Var2;
        int Sum, VarDiff,product, quotient, mod;

        //
        // collect commend variables 
        //
        Var1 = Integer.parseInt (args1[0]);
        Var2 = Integer.parseInt (args1[1]);

        Sum =  Var1 + Var2;
        product = Var1 * Var2;
        quotient = Var1 / Var2;
        mod = Var1 % Var2;
        VarDiff = Var1 - Var2;

        System.out.println(Sum);
        System.out.println(VarDiff);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(mod);

        return;
        
    }
}
