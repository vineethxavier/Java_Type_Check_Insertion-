package com.HW3.SortingEmployee;
import java.util.Comparator;

class ComparisonAge implements Comparator<Empl>{
	@Override
	public int compare(Empl eo1, Empl eo2) {
		if(eo1.getAge() > eo2.getAge()){
			return 1;
		} else {
			return -1;
		}
	}//compare
}//Class Comparison

class ComparisonFirstName implements Comparator<Empl>{

	@Override
	public int compare(Empl eo1, Empl eo2) {
		String name1 = eo1.getfName()+eo1.getlName();
		String name2 = eo2.getfName()+eo2.getlName();
		return name1.compareTo(name2);
	}//compare
	
}//ComparisonName
class ComparisonLastName implements Comparator<Empl>{

	@Override
	public int compare(Empl eo1, Empl eo2) {
		String name1 = eo1.getlName()+eo1.getfName();
		String name2 = eo2.getlName()+eo2.getfName();
		return name1.compareTo(name2); 
	}
	
}//ComparisonName