public class BreakCamelCase {

    public static void main(String[] args) {

        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));

    }
    public static String camelCase(String input) {

        char[] chars = input.toCharArray();
        String x = "";

        for(int i=0 ; i<=chars.length - 1 ; i++){

            if(Character.isUpperCase(chars[i])){

                x = x + " " + chars[i];

            } else {
                x += chars[i];
            }
        }
            return x;
    }
}
