package codeWars;
public class YoureASquare {

    public static void main(String[] args) {

        System.out.println(isSquare(233068383));

    }
    public static boolean isSquare(int n) {

        double number = 0;

        try {
            number = Math.sqrt(n);
        } catch (Exception e) {
            return false;
        }

        System.out.println(number);

        if ((int)number*number == n ){
            return true;
        } else {
            return false;
        }
    }

}
