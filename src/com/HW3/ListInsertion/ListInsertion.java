package com.HW3.ListInsertion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javafx.scene.input.TouchPoint;

public class ListInsertion {
	private static int count =0;
	private int inputInt;
    private String inputString;
    private boolean inputBool;
    private double inputDouble;
    private char inputCharacter;
	private static ListInsertion objListInsertion;
	private String element;
	private Object elementReturn;
	private int position;
	private Scanner userInput;
	public static ArrayList<Object> aList= new ArrayList<>();
	
	private static void initilize() {
		objListInsertion = new ListInsertion();
		aList.add("One");
		aList.add(2);
		aList.add("Three");
		aList.add(67.986);
		aList.add('Z');
		aList.add("ABC");
		aList.add(123);
		aList.add(true);
		aList.add("xyz");
	}//initilize
	private static void display() {
		System.out.println();
		Iterator<Object> it = aList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}//display
	public static void main(String[] args) {
		initilize();
		display();
		do{
			objListInsertion. getUSerInput();
			display();
			count++;
		}
		while(count <4);
		System.out.println("\n---thanks!!!---");
	}//main
	private void getUSerInput() {
		userInput = new Scanner(System.in);
		System.out.println("-Enter element-");
		element = userInput.nextLine();
		System.out.println("Enter number between 1-5");
		position = userInput.nextInt();
		boolean isNumber = objListInsertion.isNumberInRange(position); 
		if(!isNumber) {
			System.out.println("please enter again!!");
			objListInsertion. getUSerInput();
		}
		else {
			elementReturn = objListInsertion.checkElementType(element);
			objListInsertion.insertIntoList(elementReturn,position-1);
		}
	}//getUSerInput
	private Object checkElementType(String Element) {
		if(Element.equals("true") ) {//Boolean
			inputBool = false;
			 return inputBool;
		}else if( Element.equals("false")) {
			inputBool = true;
			 return inputBool;
		}else if( Element.length() ==1) { //char or single integer
			try{
				int val = Integer.parseInt(Element);
				return val+1;
			}
			catch (NumberFormatException ex){
				//change char to next char
				char elementCharScanned = element.charAt(0);
				System.out.println("element is character: "+ elementCharScanned);
				if (Character.isLowerCase(elementCharScanned)) {
				     inputCharacter = Character.toUpperCase(elementCharScanned);
				     return inputCharacter;
			    }else{
			    	inputCharacter = Character.toLowerCase(elementCharScanned);
			    	return inputCharacter;
			    }
			}
		}else if (isInteger(Element)) { // 2 or more digit integer 
			inputInt = Integer.parseInt(Element);
			inputInt = inputInt + 1;
			return inputInt;
		}else if(Element.contains(".")) { // double or string
			try {
	            inputDouble = Double.parseDouble(Element);
	            inputDouble += 2;
	            return inputDouble;
	        } catch (NumberFormatException e2) {
	        	inputString = Element.toUpperCase();
	           return inputString;
	        }
		}
		return "sorry";
	}//checkElementType
	public static boolean isInteger(String s) {
		try{
			Integer.parseInt(s);
			return true;
		}
		catch (NumberFormatException ex){
			return false;
		}
	}//isInteger
	private void insertIntoList(Object Element, int position) {
		aList.remove(position);
		aList.add(position, Element);
	}//insertIntoList
	private boolean isNumberInRange(int position) {
		if (position >= 0 && position < 5 && isInteger(String.valueOf(position))) {
	        return true;
	      } else {
	         return false;
	      }
	}//isNumberInRange
}//class List inserstion
