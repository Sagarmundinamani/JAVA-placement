import java.util.*;

public class Smalle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements (n):");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Fix: Read values into the array
        }
        
        // Find the smallest element
         int res=smallestArray(arr);
         System.out.println("the smallest is:"+res);
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
