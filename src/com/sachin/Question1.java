package com.sachin;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] arr = new float[5];
		arr[0] = 1.0f;
		arr[1] = 2.0f;
		arr[2] = 3.0f;
		arr[3] = 4.0f;
		arr[4] = 5.0f;

		
		float sum=calcSum(arr);
       
		System.out.println(sum);

	}

	public static float calcSum(float[] arrayForCalc) {

		float sum = 0;
		for (float f : arrayForCalc) {
		

			 sum += f;

		}

		return sum;
	}

}
