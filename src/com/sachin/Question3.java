package com.sachin;

import java.util.Iterator;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

	
		
		int[] multipliedArray=arraymultiply2(arr);
		for (int i : multipliedArray) {
			
			System.out.println(i);
			
			
		}
		

	}

	public static int[] arraymultiply2(int[] arr) {

		int i=0;
		for (int j : arr) {
		
			arr[i]=j*2;
			++i;
			
		}
		
		return arr;

	}

}
