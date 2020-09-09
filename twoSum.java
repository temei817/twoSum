import java.util.*;

public class twoSum{

	public void sort(int[] list)
	{
		int min;
		int temp;
	
		for(int i = 0; i < list.length-1; i++)
		{
			min = i; //sets index
			for(int n = i + 1; n < list.length; n++)
			{	
				if(list[n] < list[min])
				{
					min = n; //finds the smallest num
				}
			}
			temp = list[min]; //swaps value
			list[min] = list[i];
			list[i] = temp;
		
		}
	}	

	public int [] twoSum(int[] sum, int num) 
	{
		int start = 0;
		int end = sum.length-1;
		while(start < end)
		{	
			if(((sum[start] + sum[end]) == num) && (sum[start] != sum[end])) //checks if start + end = num and makes sure they're not the same number, returns index of start and end
			{
				return new int[] {start, end};
			}
			else if(((sum[start] + sum[end]) == num) && (sum[start] == sum[end])) //if it is a duplicate, returns [-1,-1]
			{
				return new int[] {-1, -1};
			}
			else if((sum[start] + sum[end]) > num) //if the sum is bigger than target, move end pointer one to the left
			{
				end--;
			}
			else if((sum[start] + sum[end]) < num) //if the sum is smaller than target, move start pointer one to the right
			{
				start++;
			}
		}
		return new int[] {-1, -1};
	}


	public static void main(String[] args)
	{
		int[] arr1 = new int[] {2, 12, 8, 7};
		int[] arr2 = new int[] {1,13,18,20,30};
		twoSum nums = new twoSum();
		nums.sort(arr1);
		System.out.println(Arrays.toString(nums.twoSum(arr1, 9)));
		nums.sort(arr2);
		System.out.println(Arrays.toString(nums.twoSum(arr2, 40)));
	}
}

