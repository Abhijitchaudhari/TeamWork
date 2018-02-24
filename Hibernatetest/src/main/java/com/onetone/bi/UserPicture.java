package com.onetone.bi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user111")
public class UserPicture {
	

    @Id
   // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable = false, unique = true)
    private int id;

     String imageName;

    @OneToOne
    @JoinColumn(name = "user")
    User user;

	@Override
	public String toString() {
		return "UserPicture [id=" + id + ", imageName=" + imageName + ", user=" + user + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserPicture(int id, String imageName, User user) {
		super();
		this.id = id;
		this.imageName = imageName;
		this.user = user;
	}

	public UserPicture() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
