package pratice;
import java.util.Arrays;
public class MinimumPlatforms {

    public static int findMinimumPlatforms(int[] arrivals, int[] departures) {
    	
       Arrays.sort(arrivals);
       Arrays.sort(departures);
       int n = arrivals.length;
       int needplatform=0;
       int maxplatform=0;
       int i=0,j=0;
       while(i<n && j<n)
       {
    	   if(arrivals[i]<=departures[j]) {
    		   needplatform++;
    		   i++;
    	   }else {
    		   needplatform--;
    		   j++;
    	   }
    	   maxplatform=Math.max(maxplatform, needplatform);
       }
    
       return maxplatform;
    }

    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findMinimumPlatforms(arrivals, departures);
        System.out.println("Minimum platforms required: " + result);
    }
}

