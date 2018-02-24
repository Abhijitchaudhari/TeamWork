package manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="University")
public class University {
	@Id
	@GeneratedValue
	@Column(name="University_id")
	int id;
	@Column(name="University_name")
	String name;
	@Column(name="country")
	String country;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	Student student;
	
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
/*	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public University( String name, String country) {
		super();
	//	this.id = id;
		this.name = name;
		this.country = country;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
