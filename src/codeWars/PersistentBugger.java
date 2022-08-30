package codeWars;
public class PersistentBugger {

    public static void main(String[] args) {

        persistentBugger(39);

    }

    private static int persistentBugger(long number) {

        int counter = 0;

        while(number > 9) {

            long helper = number;
            long proizvod = 1;

            while(helper >= 1) {
                proizvod = proizvod * (helper % 10);
                helper = helper / 10;
            }
            counter++;
            if (proizvod < 10) {
                break;
            }
            number = proizvod;
        }
        return counter;
    }

}
