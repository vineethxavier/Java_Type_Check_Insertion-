package com.HW3.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonService {
	private static ArrayList<Person> personList;
	private static Person objPerson1;
	private static Map<Float, Person> objMap;
	static Set<Integer> unique = new HashSet<Integer>();
	static List<Integer> listOfId = new ArrayList<>();
	
	static TreeMap<Integer, Integer> hmIDrepe = new TreeMap<>();
	static HashMap<Integer, Integer> hmIDrepeCopy = new HashMap<>();
	public static void main(String[] args) {
		generateList();
		displayList();
		arrayListToMap();
	}//main

	private static void arrayListToMap() {
		Float tempVal = (float) 100.0;
		System.out.println("converting list to map- if id = 1 for or more emp, changes to 1, 1.1, 1.11, 1.111");
		objMap = new HashMap<Float, Person>();
		for (int i = 0; i < personList.size(); i++) {
			int tid = personList.get(i).getId();
			if (hmIDrepeCopy.containsKey(tid) && hmIDrepeCopy.get(tid) != 0 && !(objMap.containsKey((float) tid))) {
				Float ftid = (float) tid;
				objMap.put(ftid, personList.get(i));
				Integer Val = hmIDrepeCopy.get(tid);
				Val = Val - 1;
				if (Val == 0) {
					hmIDrepeCopy.remove(tid);
				} else {
					hmIDrepeCopy.put(tid, Val);
				}
			} else if (hmIDrepeCopy.containsKey(tid) && hmIDrepeCopy.get(tid) != 0
					&& (objMap.containsKey((float) tid))) {

				Integer diff = hmIDrepe.get(tid) - hmIDrepeCopy.get(tid);
				Float FFID = (float) 0;
				if (diff > 1) {
					for (int j = 1; j <= diff; j++) {
						FFID = (float) (FFID + Math.pow(10, -j));
					}
					Float FinalID = FFID + tid;
					objMap.put(FinalID, personList.get(i));
				} else {
					Float MapID = (float) (tid + Math.pow(10, -diff));
					Float ftid = (float) MapID;
					objMap.put(ftid, personList.get(i));
				}
				// objMap.put(ftid, personList.get(i));
				Integer Val = hmIDrepeCopy.get(tid);
				Val = Val - 1;
				if (Val == 0) {
					hmIDrepeCopy.remove(tid);
				} else {
					hmIDrepeCopy.put(tid, Val);
				}
			}
		} // for
		displayMap();
	}// arrayListToMap
	private static void displayList() {
		System.out.println("Display List");
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(+personList.get(i).getId()+" : "+personList.get(i).getName()+" : "+personList.get(i).getSalary());
		}
	}//diaplayList
	private static void displayMap() {
		System.out.println("=====from map====");
		TreeMap<Float, Person> sorted = new TreeMap<>();
        sorted.putAll(objMap);
        for (Map.Entry<Float, Person> entry : sorted.entrySet()) {
        	System.out.println(entry.getKey()+" : "+entry.getValue().getName()+ " : "+ entry.getValue().getSalary());        
        }
        System.out.println("=====from map====");
	}//displayMap
	private static void generateList() {
		personList = new ArrayList<>();
		int id[] = {1,1,9,1,6,7,3,3,3,8,3,3,3};
		String name[]= {"V","X","A","B","C","D","E","F","G","H","I","J","K"};
		float salary[] = {67000,86000,55000,46000,96000,89000,86800,76000,71000,86800,76000,71000,22222};
		for (int i = 0; i < name.length; i++) {
			Person objPerson1 = new Person(id[i],name[i],salary[i]);
			personList.add(objPerson1);
			Integer tempID = objPerson1.getId();
			unique.add(tempID);
			listOfId.add(tempID);
		}
		System.out.println("===========from List================");
		for (Integer key : unique) {
			Integer repetation =  Collections.frequency(listOfId, key);
		    hmIDrepe.put(key, repetation);
		    hmIDrepeCopy.put(key, repetation);
		}
	}//generateList()
}//class PersonService
