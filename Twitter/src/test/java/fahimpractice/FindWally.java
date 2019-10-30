package fahimpractice;

public class FindWally {
/*
       given a string of words, find the word "wally" and return a string like this
       "Wally was found at index index of string
      ex1; String example1 = "there is wally across the street"
            find wally ex1 -> wally was found at 3
      ex2; String example2 = "wally is here"
            find wally ex2 -> wally was found at 1
      ex3; String example3 = "there is no one here"
            find wally ex3 -> wally was  not found

*/
      public static String whatEver3 (String sentence, String name) {

            String strArray[] = sentence.split(" ");

            for (int i = 0; i < strArray.length; i++) {
                  if (strArray[i].equalsIgnoreCase(name)) {
                        return name + " found at " + (i+1);
                  }
            }
            return "Not found";
      }
      public static void main(String[] args) {
            System.out.println(whatEver3("There is Wally across the street", "WALLY"));
            System.out.println(whatEver3("wally is here", "Wally"));
            System.out.println(whatEver3("there is no one here", "Wally"));

      }
}
