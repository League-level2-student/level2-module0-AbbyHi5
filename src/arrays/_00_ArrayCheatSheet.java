package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		String[] names = {"Brian","Calvin","Abby","Jacob","Brian I"};
		Random rand = new Random();
		int small = 100;
		int large = 0;
		//1. make an array of 5 Strings
		
		//2. print the third element in the array
		System.out.println(names[2]);
		System.out.println("-");
		//3. set the third element to a different value
		names[2] = "Lily";
		//4. print the third element again
		System.out.println(names[2]);
		System.out.println("-");
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("-");
		//6. make an array of 50 integers
		int[] nums = {12,21,8,9,61,82,80,55,17,68,47,73,54,69,31,29,18,11,37,61,28,70,22,15,84,25,40,74,10,97,98,88,33,6,22,46,10,13,100,73,82,80,53,67,42,46,94,24,76,44};
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < nums.length; i++) {
			int n = rand.nextInt(100) + 1;
			nums[i] = n;
		}
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < small) {
				small = nums[i];
			}	
		}
		System.out.println(small);
		System.out.println("-");
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//10. print the largest number in the array.
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > large) {
				large = nums[i];
			}	
		}
		System.out.println("-");
		System.out.println(large);
		System.out.println("-");
	}
}
