public class Primes {


    public static void main(String[] args1) { 
      int StartVar,EndVar;

      StartVar = Integer.parseInt (args1[0]);
      EndVar = Integer.parseInt (args1[1]);

      ShowPrimeNumber(StartVar,EndVar);
      return;
    }

    public static boolean FuncPrimeChecker (int InputVar) {
        int SqrtN = (int) Math.sqrt(InputVar);
        
        if (InputVar == 1) return false;

        if (InputVar == 2) return true;

        if (InputVar % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= SqrtN; i += 2) {
            if (InputVar % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void ShowPrimeNumber (int StartVar, int EndVar) {

        for (int cnt = StartVar; cnt <= EndVar; cnt++) {
           if(FuncPrimeChecker(cnt)) {
             System.out.println(cnt);
           }

        }
    }

}