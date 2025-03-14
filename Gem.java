import java.util.*;
    public class Gem {
        public static void main (String args[]) {
            Scanner sc = new Scanner((System.in));
            System.out.println("enter the number of the stones:");
            int n = sc.nextInt();
            int gems[] = new int[n];
            System.out.println("enter the radiance value of the gems:");
            for (int i = 0; i < n; i++) {
                gems[i] = sc.nextInt();
            }
            int result = countRadianceGems(gems);
            System.out.println("number of the more radiance gem" + result);
        }
        public static int countRadianceGems(int gems[]){
            int maxRadiance=Integer.MIN_VALUE;
            int count=0;
            for(int gem:gems){
                if(gem> maxRadiance){
                    maxRadiance=gem;
                    count++;
                }
//this    
            }
            return count;
        }
    }
