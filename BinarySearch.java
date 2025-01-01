package pratice;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int ele = 2;
		if(Search_binary(arr, ele))
		{
			System.out.println("  element  found");
		}else {
			System.out.println("not found ");
		}
	}
	
   static boolean Search_binary(int[] arr,int ele)
   {
	   int start=0;
	   int end =arr.length-1;
	   while(start<=end)
	   {
		   int pivot = (start+end)/2;
		   if(ele<arr[pivot])
		   {
			   end=pivot-1;
		   }else if(ele>arr[pivot]) {
			   start=pivot+1;
		   }else if(ele==arr[pivot])
		   {
			   return true;
		   }
	   }
	   return false;
   }
}
