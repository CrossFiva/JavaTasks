
// public class 


public class HomeworkLab4 {

    private static String MovieLists[] = {
      "The Red Line",
      "Iron Man",
      "The Dark Night",
      "The Red Line",
      "Help",
      null
    };
    

    public static void main(String[] args1) {
      // printMovies (3, "Guardians of the Galaxy");

      PrintMovies ("RRRRRRRR, BBB,AAAA, 12333, arrival time, disper");

    }
    
    /*
    printMovies 
    */
    public static void printMovies (int RankVal, String MovieName) {

      System.out.println(RankVal + ". " + HomeworkLab4.MovieLists [RankVal]);

      MovieLists [RankVal] = MovieName;

      for (int i = 0; MovieLists[i] != null; i++ )
      System.out.println( i+ ". " + MovieLists[i]);
      
      

    }

    public static void PrintMovies (String Movies) {
      int StartVal;
      int CurrentVal;
      char[] TempString = new char[20];

      StartVal = 0;
      CurrentVal = 0;

       
      System.out.println("length : " + Movies.length());
      for (int i = 0; i < Movies.length(); i++) {
        if (Movies.charAt(i) == ',') {
          CurrentVal = i;
          Movies.getChars(StartVal, CurrentVal, TempString, 0);
          System.out.println(TempString);
          StartVal = CurrentVal + 2;


        } else if (i == (Movies.length() - 1)) {
          Movies.getChars(CurrentVal, Movies.length(), TempString, 0);
          System.out.println(TempString.toString());

        }

      }

    }
}

