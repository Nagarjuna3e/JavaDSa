//package Sorting;
import java.util.*;

  
 class SearchElement
{  
	public static boolean Search(int[] arr,int ele)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				return true;
			}
			
		}
		return false;
	}
}

public class LinearSearch 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	int[] arr = {1,2,3,4,5,6,7,7,10};
	System.out.println("enter an element");
	int ele = sc.nextInt();
	if(SearchElement.Search(arr,ele))
	{
		System.out.println("ELEMENT FOUND");
	}
	else
	{
		System.out.println("NOT FOUND");
	}	
}
}

