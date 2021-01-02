public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour >= 0) {
            long calcKilometersToMiles = Math.round((kilometersPerHour/1.609));
            return calcKilometersToMiles;
        }

        else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour >=0) {
            int calcKilometersToMiles = (int) Math.round((kilometersPerHour/1.609));
            String transformed = kilometersPerHour + " km/h = " + calcKilometersToMiles + " mi/h";
            System.out.println(transformed);
        }

        else {
            String errorMessage = "Invalid Value";
            System.out.println(errorMessage);
        }
    }
}
