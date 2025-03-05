import java.util.Scanner;

public class CountSunday {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input: Start day and number of days in the month
            System.out.println("Enter the starting day of the month (Monday = 1, Sunday = 7):");
            int startDay = sc.nextInt();
            System.out.println("Enter the total number of days in the month:");
            int totalDays = sc.nextInt();

            sc.close();

            int sundayCount = 0;


            // Checking for Sundays, starting from day = 1
            for (int day = 1; day <= totalDays; day++) {
                if ((startDay + day - 1) % 7 == 0) { 
                    sundayCount++;
                }
            }

            // Output result
            System.out.println("Number of Sundays in the month: " + sundayCount);
        }
    }
