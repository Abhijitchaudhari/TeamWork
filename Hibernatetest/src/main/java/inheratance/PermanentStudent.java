 
package inheratance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 

@DiscriminatorValue("PermanentStudent")  
public class PermanentStudent extends Student {
	
	 @Column(name="perStudId")  
	
	int perSTudId;
	 @Column(name="perStudName")  

	String perStudName;

	@Override
	public String toString() {
		return "PermenantStudent [perSTudId=" + perSTudId + ", perStudName=" + perStudName + "]";
	}

	public int getPerSTudId() {
		return perSTudId;
	}

	public void setPerSTudId(int perSTudId) {
		this.perSTudId = perSTudId;
	}

	public String getPerStudName() {
		return perStudName;
	}

	public void setPerStudName(String perStudName) {
		this.perStudName = perStudName;
	}

	public PermanentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentStudent(int perSTudId, String perStudName) {
		super();
		this.perSTudId = perSTudId;
		this.perStudName = perStudName;
	}


}