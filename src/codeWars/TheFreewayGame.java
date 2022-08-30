package codeWars;
public class TheFreewayGame {

    public static void main(String[] args) {

        final int result = freewayGame(30.0, 100.0, new double[][]{{-1.0, 110.0}, {-0.7, 102.0}, {-1.5, 108.0}});

        System.out.println(result);

    }

    private static int freewayGame(final double distKmToExit, final double mySpeedKph, final double[][] otherCars) {

        double myTime = distKmToExit / mySpeedKph * 60;
        double carTime = 0;
        double carSpeed = 0;
        int carCount = 0;

        System.out.println(myTime);

        for (int i = 0; i < otherCars.length; i++) {

            carSpeed = otherCars[i][1];
            double beforeAfter = otherCars[i][0];

            carTime = distKmToExit / carSpeed * 60;

            carTime += otherCars[i][0];

            if (beforeAfter < 0) {
                if (!(carSpeed > mySpeedKph)) {
                    if (carTime < myTime) {
                        carCount--;
                    } else if (carTime > myTime) {
                        carCount++;
                    }
                }
            } else if (beforeAfter > 0) {
                if(!(carSpeed < mySpeedKph)) {
                    if(carTime > myTime) {
                        carCount++;
                    } else if (carTime < myTime) {
                        carCount--;
                    }
                }
            }

        }
        return carCount;
    }
}
