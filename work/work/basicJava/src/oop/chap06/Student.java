package oop.chap06;

public class Student {
	private String name;
	private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		
	}
	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}	
	public Student(String name, int age, int korean, int english, int math, int science) {
		super();			// ��ӿ��� ����
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	
	public double getAvg() {
		return (double)(korean + english + math + science) / 4;
	}
	public String getGrade() {	
		double avg = getAvg();
		String grade = "";
		if(avg >= 90 & avg <= 100) {
			grade = "A����";
		} else if(avg >= 70) {
			grade = "B����";
		} else if(avg >= 50) {
			grade = "C����";
		} else if(avg >= 30) {
			grade = "D����";
		} else {
			grade = "F����";
		}
		return grade;
	}
	public void print() {
		System.out.println(name + " ���: " + getAvg() + " ����: " + getGrade());
	}

}