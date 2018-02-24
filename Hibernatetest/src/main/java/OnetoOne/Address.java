package OnetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@Column(name="Pin")
	int Pin;
	@Column(name="city")
	String city;
	
	@OneToOne(cascade=CascadeType.ALL)
	Person person;
	
	
	@Override
	public String toString() {
		return "Address [Pin=" + Pin + ", city=" + city + "]";
	}
	public Address(int pin, String city) {
		super();
		Pin = pin;
		this.city = city;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
