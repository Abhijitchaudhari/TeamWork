package com.onetone.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable = false, unique = true)
    int id;

     String firstname;

     String lastname;

    @OneToOne(mappedBy="user", cascade=CascadeType.ALL)
    @JoinColumn(name = "picture") //field named "picture" in the database
     UserPicture userPicture;

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", userPicture=" + userPicture
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public UserPicture getUserPicture() {
		return userPicture;
	}

	public void setUserPicture(UserPicture userPicture) {
		this.userPicture = userPicture;
	}

	public User(int id, String firstname, String lastname, UserPicture userPicture) {
		super();
	//	this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.userPicture = userPicture;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
