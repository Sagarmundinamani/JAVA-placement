import java.util.*;
public class LargestArray {
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
        
        // Find the largest element
        int result = largestArray(arr);
        System.out.println("Largest element: " + result);
        
        sc.close(); // Closing scanner
    }

    public static int largestArray(int arr[]) {
        int largeElement = arr[0]; // Assume first element is largest
        
        for (int i = 1; i < arr.length; i++) { // Fix: Start from index 1
            if (arr[i] > largeElement) {
                largeElement = arr[i]; // Update largest element
            }
        }
        return largeElement;
    }
}
