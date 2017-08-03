package com.vimal;

import java.util.Scanner;

public class Main {

	private static Scanner sccanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = new int[5];

		array = getIntegers(array);

		printArray(array);

		sortInteger(array);
		System.out.println("*******************************");
		printArray(array);
	}

	private static int[] getIntegers(int[] array) {
		System.out.println("Please enter 5 integers");

		for (int i = 0; i < array.length; i++) {
			array[i] = sccanner.nextInt();
		}
		return array;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("The " + (i + 1) + " element is " + array[i]);
		}
	}

	private static int[] sortInteger(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

}
