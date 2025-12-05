package hibernate.PracticeHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private char grade;
	private String branch;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, char grade, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.branch = branch;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", branch=" + branch + "]";
	}

}
