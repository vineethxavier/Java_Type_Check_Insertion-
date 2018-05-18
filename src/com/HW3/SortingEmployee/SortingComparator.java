package com.HW3.SortingEmployee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingComparator {
	private static List<Empl> list;
	private static Scanner userIn;
	private static int choice;
 
	public static void main(String[] args) {
		insertEmp();
		displayEmployees(list);
		do {
			getUserInput();
		} while (choice != 0);

	}// main

	private static void getUserInput() {
		userIn = new Scanner(System.in);
		System.out.println("\n1: sort by First Name");
		System.out.println("2: sort by Last Name");
		System.out.println("3: sort by Age");
		System.out.println("0: Exit");
		choice = userIn.nextInt();
		switch (choice) {
		case 1:// sort by Fname
			System.out.println("---Sorting by First Name---");
			Collections.sort(list, new ComparisonFirstName());
			displayEmployees(list);
			break;
		case 2:// sort by Lname
			System.out.println("---Sorting by Last Name---");
			Collections.sort(list, new ComparisonLastName());
			displayEmployees(list);
			break;
		case 3:// sort by age
			System.out.println("---Sorting by Age---");
			Collections.sort(list, new ComparisonAge());
			displayEmployees(list);
			break;
		case 0:
			System.out.println("---Thanks!!!---");
			System.exit(0);
			break;
		default:
			System.out.println("Lets try that again");
			getUserInput();
			break;
		}

	}// getUSerInput

	private static void displayEmployees(List<Empl> List) {
		for (Empl e : list) {
			System.out.println("Fname: " + e.getfName() + "   Lname: " + e.getlName() + "   age: " + e.getAge());
		}
	}// displayEmployees

	private static List<Empl> insertEmp() {
		System.out.println("==============");
		list = new ArrayList<Empl>();
		list.add(new Empl(1000, "v", "x", 11));
		list.add(new Empl(1001, "v", "axb", 21));
		list.add(new Empl(1002, "v", "axa", 32));
		list.add(new Empl(1003, "v", "ax", 43));
		list.add(new Empl(1004, "av", "bx", 32));
		list.add(new Empl(1005, "bv", "bx", 33));
		list.add(new Empl(1006, "bav", "bx", 35));
		System.out.println("before sorting");
		return list;
	}// insertEmp

}// SortingComparator
