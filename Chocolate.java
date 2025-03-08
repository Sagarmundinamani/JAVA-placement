import java.util.Arrays;

public class Chocolate {
    public static void moveEmptyPacketsToEnd(int[] packets) {
        int nonZeroIndex = 0;
        
        // Traverse the array, moving non-zero elements to the front
        for (int i = 0; i < packets.length; i++) {
            if (packets[i] != 0) {
                packets[nonZeroIndex++] = packets[i];
            }
        }
        
        // Fill the remaining positions with zeros
        while (nonZeroIndex < packets.length) {
            packets[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] packets = {4, 0, 3, 0, 2, 1, 0, 5};
        System.out.println("Before: " + Arrays.toString(packets));
        moveEmptyPacketsToEnd(packets);
        System.out.println("After: " + Arrays.toString(packets));
    }
}
