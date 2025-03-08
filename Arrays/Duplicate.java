import java.util.*;
public class Duplicate
{
	static void findNonRepeatingElement(int nums[]) {
	    Arrays.sort(nums);
	    
	    if(nums[0] != nums[1]) System.out.print(nums[0]+" ");
	    
	    for(int i=1;i<nums.length-1;i++) 
	        if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
	            System.out.print(nums[i]+" ");
	            
if(nums[nums.length-2] != nums[nums.length-1]) System.out.print(nums[nums.length-1]);
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-1,1,3,1};
		System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(nums);
		
	}
}
 
    
