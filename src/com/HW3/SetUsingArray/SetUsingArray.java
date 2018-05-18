package com.HW3.SetUsingArray;
import java.util.Collections;
import java.util.Scanner;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
public class SetUsingArray {
	private static Object myArray[] = new Object[10];
	private static Scanner userIn;
	private static int choice;

	public static void main(String[] args) {
		displayArray(myArray);
		do {
			getUserInput();
		} while (choice != 0);
	}// main

	private static void displayArray(Object[] myArray) {
			for (int i = 0; i < myArray.length && myArray[i] !=null; i++) {
				System.out.print(" " + myArray[i].toString());
			}
			System.out.println();
	}// displayArray

	private static boolean isArrayEmpty(Object[] myArray) {
			if (myArray[myArray.length-1] != null) {
				return false;
			}
		//}
		return true;
	}// isArrayEmpty
	private static void getUserInput() {
		userIn = new Scanner(System.in);
		System.out.println("\n1: Insert");
		System.out.println("2: Remove");
		System.out.println("3: Display");
		System.out.println("0: Exit");
		choice = Integer.parseInt(userIn.nextLine());
		switch (choice) {
		case 1:// Inserting
			System.out.println("---Inserting---");
			insert();
			break;
		case 2:// Removing
			System.out.println("---Removing---");
			remove();
			break;
		case 3:// Displaying
			System.out.println("---Displaying---");
			displayArray(myArray);
			getUserInput();
			break;
		case 0://Exit
			System.out.println("---Thanks!!!---");
			System.exit(0);
			break;
		default:
			System.out.println("Lets try that again");
			getUserInput();
			break;
		}
	}// getUSerInput
	private static void remove() {
		int flag = 0;
		System.out.println("Enter what you would like to remove:");
		Object in = (Object)userIn.nextLine();
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]!=null && myArray[i].equals(in)) {
				System.out.println("remvoing");
				int removeIndex = i;
				for(int j = removeIndex; j < myArray.length -1; j++){
					myArray[j] = myArray[j + 1];
			      }
				flag =1;
				displayArray(myArray);
				break;
			}
		}
		if( flag ==0) {
			System.out.println("Sorry, Not found try again");
			getUserInput();
		}
	}//remove

	private static void insert() {
		int flag = 0;
		if (!isArrayEmpty(myArray)) {
			System.out.println("Array full");
			getUserInput();
		} else {
			System.out.println("Enter what you would like to add:");
			Object in = (Object)userIn.nextLine();
			for (int i = 0; i < myArray.length; i++) {
				if (myArray[i]!=null && myArray[i].equals(in)) {
					System.out.println("Already present");
					getUserInput();
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				for (int j = 0; j < myArray.length; j++) {
					if (myArray[j] == null) {
						myArray[j] = in;
						break;
					}
				}
			}
		}
	}// insert
	private static boolean doesItContains(Object in) {
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] == in) {
				return true;
			}
		}
		return false;
	}//doesItContains
	
}// class SetUsingArray
