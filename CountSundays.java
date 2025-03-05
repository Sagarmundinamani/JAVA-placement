import java.util.*;

public class CountSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Input: Start day and number of days in the month
        System.out.println("Enter the starting day of the month (Monday = 0, Sunday = 6):");
        int startDay = sc.nextInt();
        System.out.println("Enter the total number of days in the month:");
        int totalDays = sc.nextInt();
        
        sc.close();

        int sundayCount = 0;

        // Checking for Sundays
        for (int day = 0; day < totalDays; day++) {
            if ((startDay + day) % 7 == 6) { // 6 represents Sunday
                sundayCount++;
            }
        }

        // Output result
        System.out.println("Number of Sundays in the month: " + sundayCount);
    }
}
