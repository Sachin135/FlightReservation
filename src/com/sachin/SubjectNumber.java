package com.sachin;

import java.time.LocalDate;

public class SubjectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[5];
		arr[0] = "Math";
		arr[1] = "LAL";
		arr[2] = "Physics";
		arr[3] = "Science";
		arr[4] = "Social Studies";

        int searchedIndex= searchingArray(arr, "social studies");
        
        
    	String output = String.format("Searched Index is %d", searchedIndex);
		System.out.println(output);
        

	}

	private static int searchingArray(String[] arr, String searchedText) {
		// TODO Auto-generated method stub

		
		int j=0;
		
		for (int i = 0; i < arr.length; i++) {

			if (searchedText.equalsIgnoreCase(arr[i])) {

				j=i;

			}

		}
		return j;

	}

}
