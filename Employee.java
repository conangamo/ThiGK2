package GK2;

import java.io.Serializable;
import java.util.*;

interface IEmployee {
	void showInfo();
}

class Employee implements IEmployee, Serializable {
	protected int id;
	protected String fullName;
	protected String birthDay;
	protected String phone;
	protected String email;
	protected String employeeType;
	protected static int employeeCount = 0;

	public Employee(int id, String fullName, String birthDay, String phone, String email, String employeeType) {
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		employeeCount++;
	}
	 public static int getEmployeeCount() {
	        return employeeCount;
	    }

	public void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("Full Name: " + fullName);
		System.out.println("Birth Day: " + birthDay);
		System.out.println("Phone: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Employee Type: " + employeeType);
	}
}

class Experience extends Employee implements Serializable {
	private int expInYear;
	private String proSkill;

	public Experience() {
		super(0, "", "", "", "", "");
		this.expInYear = 0;
		this.proSkill = "";
	}

	public Experience(int id, String fullName, String birthDay, String phone, String email, String employeeType,
			int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Experience In Year: " + expInYear);
		System.out.println("Pro Skill: " + proSkill);
	}
}

class Fresher extends Employee implements Serializable {
	private String graduationDate;
	private String graduationRank;
	private String education;

	public Fresher(int id, String fullName, String birthDay, String phone, String email, String employeeType,
			String graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Graduation Date: " + graduationDate);
		System.out.println("Graduation Rank: " + graduationRank);
		System.out.println("Education: " + education);
	}
}

class Intern extends Employee implements Serializable {
	private String majors;
	private String semester;
	private String universityName;

	public Intern(int id, String fullName, String birthDay, String phone, String email, String employeeType,
			String majors, String semester, String universityName) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Majors: " + majors);
		System.out.println("Semester: " + semester);
		System.out.println("University Name: " + universityName);
	}
}
