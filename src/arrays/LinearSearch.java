package arrays;

import java.util.Scanner;

public class LinearSearch {
	private static int [] InputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length/size of Array : ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element at index" +" ["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		//sc.close();  //this line will cause Exception i.e, java.util.NoSuchElementException
		return arr;
		
	}
	private static int Search(int find_num,int arr[]) {
		
		
		for(int i=0;i<arr.length;i++) {
			if(find_num==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			int arr[]= InputArray();
			
			 System.out.println("Enter the element you want to search : ");
				int find_num = sc.nextInt();
				int element_found_at_index= Search(find_num,arr);
				System.out.println("element_found_at_index : "+ element_found_at_index);
			
			
	
		sc.close();

	}
	

}
