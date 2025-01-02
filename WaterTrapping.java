package pratice;

import java.util.Scanner;

public class WaterTrapping {

    public static int trapWater(int[] heights) {
       int n = heights.length;
       int[] leftMax = new int[n];
       leftMax[0]=heights[0];
       
       int[] rightMax = new int[n];
       rightMax[n-1]=heights[n-1];
       
       for(int i=1;i<n;i++)
       {
    	   leftMax[i]=Math.max(leftMax[i-1],heights[i]);
       }
       
       for(int i=n-2;i>=0;i--)
       {
    	   rightMax[i]=Math.max(rightMax[i+1], heights[i]);
       }
       int waterTapping=0;
       for(int i=0;i<n;i++)
       {
    	   waterTapping+=Math.min(leftMax[i],rightMax[i])-heights[i];
       }
       return waterTapping;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    	for(int i=0;i<arr.length;i++) {
    		System.out.println("enter "+i+"th index  element ");
    		arr[i]=sc.nextInt();
    	}
    	int result = trapWater(arr);
    	System.out.println("Total water tapped in the bars "+result);
    }
}
