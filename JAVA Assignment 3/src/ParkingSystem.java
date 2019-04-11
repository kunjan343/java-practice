import java.util.Scanner;

public class ParkingSystem {
    // Determine hourly rate
    private static float getHourlyRate(int hours, boolean isMember) {
        if (isMember) {
            return 2;
        } else if (hours > 12) {
            return 2.5f;
        } else {
            return 3;
        }
    }

    // Count total payable charge
    private static float getCharges(int hours, float rate) {
        final int maxCharge = 100;
        float totalCharge = hours * rate;
        if (totalCharge > 100) {
            return maxCharge;
        }
        return totalCharge;
    }

    // Main method
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Predefined variables
        final String sayYes = "yes";

        // Ask for number of hours parked
        System.out.println("Number of hours parked:");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid data entered. Program terminating.");
            System.exit(0);
        }
        double inputHours = input.nextDouble();
        int hours = (int) Math.ceil(inputHours);

        // Ask for membership
        System.out.println("Do you have membership:");
        String membershipType = input.next();
        boolean isMembership = sayYes.equals(membershipType);

        float chargeRate = getHourlyRate(hours, isMembership);
        float totalCharge = getCharges(hours, chargeRate);

        //Print output
        System.out.println("Hourly Rate: $" + chargeRate);
        System.out.println("Number of Hours Charged: " + hours);
        System.out.println("Total Charges: $" + totalCharge);
    }
}
