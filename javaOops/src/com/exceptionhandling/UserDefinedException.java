package com.exceptionhandling;

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			int arr[] = new int[4];
			arr[4] = 6;
			if (arr[4] == 6) {
				throw new ChanduException("you are aceessing the larger value");
			}
		} catch (Exception e) {
			System.out.println("the error came at the " + e.getMessage());
		} finally {
			System.out.println("bye bye");
		}
	}

}
