import java.util.*;

public class twoSum{

	public void sort(int[] list)
	{
		int min;
		int temp;
	
		for(int i = 0; i < list.length-1; i++)
		{
			min = i;
			for(int n = i + 1; n < list.length; n++)
			{	
				if(list[n] < list[min])
				{
					min = n;
				}
			}
			temp = list[min];
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
			if(((sum[start] + sum[end]) == num) && (sum[start] != sum[end]))
			{
				return new int[] {start, end};
			}
			else if(((sum[start] + sum[end]) == num) && (sum[start] == sum[end]))
			{
				return new int[] {-1, -1};
			}
			else if((sum[start] + sum[end]) > num)
			{
				end--;
			}
			else if((sum[start] + sum[end]) < num)
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

