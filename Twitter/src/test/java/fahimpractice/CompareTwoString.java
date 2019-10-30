package fahimpractice;

public class CompareTwoString {
    // create a method that takes a string, checks is it has the same number of x's and o's
    //   and returns either false or true.


    public static boolean whatEver1(String sentence) {

        String strArray[] = sentence.split("");
         int numx = 0;
         int numo = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equalsIgnoreCase("X")) {
                numx++;
            }else if (strArray[i].equalsIgnoreCase("O")) {
                numo++;
            }
        }
        if(numx == numo){
            return  true;

        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(CompareTwoString.whatEver1("oxoxoxx"));
    }
}