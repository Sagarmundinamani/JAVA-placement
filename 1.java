public class ClimbWell {
    public static void main(String[] args) {
        int wellHeight = 50;  // Total height of the well
        int climbPerDay = 4;  // Climb during the day
        int slidePerNight = 3;  // Slide during the night
        int currentHeight = 0; 
        int days = 0;
     
        while (true) {
            days++;  // Start the day
            currentHeight += climbPerDay;  // Climb up
            
            // Check if he reaches the top
            if (currentHeight >= wellHeight) {
                System.out.println("The man will climb out in " + days + " days.");
                break;
            }

            currentHeight -= slidePerNight;  // Slide down at night
        }
    }
}
