import java.util.Scanner;

public class TrainBridgePassTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Given length of train and bridge
        int lengthOfTrain = 400; // in meters
        int lengthOfBridge = 400; // in meters
        int totalLength = lengthOfTrain + lengthOfBridge; // Total distance to be covered

        // Taking speed of train (SOT) as input
        System.out.print("Enter the speed of the train in km/hr: ");
        int sot = scanner.nextInt(); // Speed in km/hr

        // Validating input
        if (sot <= 0 || sot >= 200) {
            System.out.println("Speed of train should be between 1 and 200 km/hr.");
        } else {
            // Convert speed from km/hr to m/s => (Speed * 1000) / 3600 = Speed * 5/18
            double speedInMetersPerSecond = sot * (5.0 / 18.0);

            // Calculate time required (Total length / Speed in m/s)
            double timeRequired = totalLength / speedInMetersPerSecond;

            // Output the time in seconds
            System.out.println("Time required to pass the bridge: " + Math.round(timeRequired) + " seconds");
        }

        scanner.close();
    }
}
