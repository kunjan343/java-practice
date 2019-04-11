import javax.swing.*;

public class ParkingSystemDialog {
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
        // Ask for number of hours parked
        String dialogInput = JOptionPane.showInputDialog(null, "Number of hours parked:");
        int hours = 0;
        try {
            double inputHours = Double.parseDouble(dialogInput);
            hours = (int) Math.ceil(inputHours);
        } catch (Exception ex) {
            System.out.println("Invalid data entered. Program terminating.");
            System.exit(0);
        }

        // Ask for membership
        int membership = JOptionPane.showConfirmDialog(null,
                "Do you have membership", "Membership",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        boolean isMembership = membership == JOptionPane.YES_OPTION;
        // Count hourly rate
        float chargeRate = getHourlyRate(hours, isMembership);
        // Count total charge
        float totalCharge = getCharges(hours, chargeRate);

        // Print output
        System.out.println("Hourly Rate: $" + chargeRate);
        System.out.println("Number of Hours Charged: " + hours);
        System.out.println("Total Charges: $" + totalCharge);
    }
}
