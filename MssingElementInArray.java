package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MssingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int count=1;
		for(int i : arr)
		{
			if(i!=count)
			{
				System.out.println("The missing number is  " +count);
				break;
			}
			count ++;
		}		
}
}
