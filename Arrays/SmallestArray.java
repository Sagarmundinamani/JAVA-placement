import java.util.*;

public class SmallestArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements (n):");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        // Taking input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Fix: Read values into the array
        }
        
        // Find the smallest element
        int result = smallestArray(arr);
        System.out.println("Smallest element: " + result);
        
        sc.close(); // Closing scanner
    }

    public static int smallestArray(int arr[]) {
        int smallElement = arr[0]; // Assume first element is smallest
        
        for (int i = 1; i < arr.length; i++) { // Fix: Start from index 1
            if (arr[i] < smallElement) {
                smallElement = arr[i]; // Update smallest element
            }
        }
        return smallElement;
    }
}
