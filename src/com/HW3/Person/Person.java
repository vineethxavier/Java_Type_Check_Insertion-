package com.HW3.Person;

public class Person {

	private int id;
	private String name;
	private float salary;
	public Person() {
		
	}
	public Person(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}//class person



//back up PersonService

/*package com.HW3.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonService {
	private static ArrayList<Person> personList;
	private static Person objPerson1;
	private static Map<Float, Person> objMap;
	public static void main(String[] args) {
		generateList();
		displayList();
		arrayListToMap();
	}//main
	private static void arrayListToMap() {
		Float tempVal = (float)100.0;
		System.out.println("converting list to map- if id = 1 for or more emp, changes to 1, 1.1, 1.1.1");
		objMap = new HashMap<Float, Person>();
		for (int i = 0; i < personList.size(); i++) {
			Float fID = (float)personList.get(i).getId();
			if( i ==0) {
				objMap.put(fID, personList.get(i));
			}else if(objMap.containsKey(fID)) {
				Float x = fID;
				tempVal++;
				
				objMap.put(tempVal, personList.get(i));
			}
		}
		displayMap();
	}//arrayListToMap
	private static void displayList() {
		System.out.println("Display List");
		int count =1;
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(count+": "+personList.get(i).getId()+" , "+personList.get(i).getName()+" , "+personList.get(i).getSalary());
			count++;
		}
	}//diaplayList
	private static void displayMap() {
		int count =1;
		for(Map.Entry<Float, Person> mp : objMap.entrySet()) {
			System.out.println(count +" ID: "+ mp.getKey()+" Name: "+mp.getValue().getName()+" Salary: "+mp.getValue().getSalary());
			count++;
		}
	}
	private static void generateList() {
		personList = new ArrayList<>();
		int id[] = {1,1,1,1,2,2,3,3,4};
		String name[]= {"V","X","A","B","C","D","E","F","G"};
		float salary[] = {67000,86000,55000,46000,96000,89000,86800,76000,71000};
		for (int i = 0; i < name.length; i++) {
			objPerson1 = new Person(id[i],name[i],salary[i]);
			personList.add(objPerson1);
		}
	}//generateList()
}//class PersonService



Person objPerson2 = new Person(1,"Xavier",86000);
Person objPerson3 = new Person(1,"Vineeth",78000);
Person objPerson4 = new Person(1,"Vineeth",55000);
Person objPerson5 = new Person(1,"Vineeth",66000);
Person objPerson6 = new Person(1,"Vineeth",88000);
Person objPerson7 = new Person(1,"Vineeth",65000);
Person objPerson8 = new Person(1,"Vineeth",87000);
Person objPerson9 = new Person(1,"Vineeth",86000);
*/