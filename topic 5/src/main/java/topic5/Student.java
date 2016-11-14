package topic5;



import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
 

@Entity
public class Student extends BaseEntity {
	
 
    private String name,lastName,birth,course;
    private int first=0,second=0,third=0,finalNote=0;
 

 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    
    

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	public int getTotal() {
		return finalNote;
	}

	public void setTotal(int total) {
		this.finalNote = total;
	}

	

	


 
}