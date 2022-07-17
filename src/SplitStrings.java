import java.util.ArrayList;
import java.util.List;

public class SplitStrings {

    public static void main(String[] args) {

        splitString("Prv");
        splitString("Ftor");
        splitString("");
    }

    private static String[] splitString(String s) {

        int charCounter = 0;

        if (s.length() % 2 == 0) {

            String[] split = new String[s.length() / 2];

            for (int i = 0; i < s.length() / 2; i++) {

                String bukvi = s.substring(charCounter, charCounter + 2);

                if(i == s.length()/2){
                    break;
                } else {
                    split[i] = bukvi;
                }
                charCounter += 2;

                System.out.println(split[i]);

            }
            return split;

        } else {

            String[] split = new String[s.length() / 2 + 1];
            for (int i = 0; i <= s.length() / 2; i++) {



                String bukvi;

                try {

                    bukvi = s.substring(charCounter, charCounter + 2);

                } catch (Exception e) {

                    bukvi = s.substring(charCounter, charCounter + 1) + "_";

                }

                split[i] = bukvi;

                charCounter += 2;

                System.out.println(split[i]);
            }
            return split;


        }

    }

}

