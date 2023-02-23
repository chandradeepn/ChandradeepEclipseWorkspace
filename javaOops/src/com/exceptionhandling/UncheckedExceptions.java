package com.exceptionhandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		try {
			int a1 = 10;
			int b2 = 20;
			int sum = a1 / b2;
			int arr[] = new int[2];
			arr[3] = 4;

		} catch (ArithmeticException e) {
			System.out.println("the number can't be divisble by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you are giving more than the array length");
		} finally {
			System.out.println("good bye to you");
		}

	}

}
