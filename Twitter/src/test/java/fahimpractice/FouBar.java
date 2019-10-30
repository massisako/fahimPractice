package fahimpractice;

public class FouBar {

    //
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("foobar");

            } else if (i % 5 == 0) {
                System.out.println("bar");

            } else if (i % 3 == 0) {
                System.out.println("foo");

            } else if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}










