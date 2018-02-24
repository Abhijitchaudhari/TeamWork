package manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Student_details")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="Stud_ID")
	int id;
	@Column(name="Stud_NAME")
	String stud_Name;
	
	
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="UNIVERSITY_ID")
	University universityDetails;
	@Override
	public String toString() {
		return "Student [id=" + id + ", stud_Name=" + stud_Name + ", universityDetails=" + universityDetails + "]";
	}
	public Student( String stud_Name, University universityDetails) {
		super();
	//	this.id = id;
		this.stud_Name = stud_Name;
		this.universityDetails = universityDetails;
	}
/*	public int getId() {
		return id;*/
	/*}
	public void setId(int id) {
		this.id = id;*/
//	}
	public String getStud_Name() {
		return stud_Name;
	}
	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}
	public University getUniversityDetails() {
		return universityDetails;
	}
	public void setUniversityDetails(University universityDetails) {
		this.universityDetails = universityDetails;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
