public class Collatz {

    public static void main(String[] args) {

        System.out.println(collatzz(3));

    }

    public static String collatzz(int n) {

        String result = "";

        while (n >= 1) {
            if (n % 2 == 0) {
                if (n == 1) {
                    result += n;
                    break;
                } else {
                    result = result + n + "->";
                    n /= 2;
                }
            } else if (n % 2 == 1) {
                if (n == 1) {
                    result += n;
                    break;
                } else {
                    result = result + n + "->";
                    n = 3*n+1;
                }
            }

        }
        return result;
    }
}
