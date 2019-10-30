package fahimpractice;

public class PrintThe1stDigitInString {
    //write down a method that prints the first digit that is found inside the string

    public static String mafiisaduch(String str) {

        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) {
                return "the first digit is : " + str.charAt(i);
            }
        return "not found";
    }
        public static void main (String[]args){

            System.out.println(mafiisaduch("ndvudjsu3bdh"));
            System.out.println(mafiisaduch("jdudndsusj5jnfju"));
        }
    }
