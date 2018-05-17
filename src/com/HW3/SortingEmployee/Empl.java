package com.HW3.SortingEmployee;

class Empl{
	
	private int id;
    private String fName;
    private String lName;
    private int age;
    
	public Empl(int id, String fName, String lName, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
}//class Emp
