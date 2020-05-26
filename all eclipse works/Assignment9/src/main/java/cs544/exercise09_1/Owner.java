package cs544.exercise09_1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Owner {
	@Id  
    @GeneratedValue
    private int id;
    private String name;
    //@OneToMany (fetch = FetchType.EAGER, cascade={CascadeType.PERSIST})
    @OneToMany (cascade={CascadeType.PERSIST})
    
    //this is the best as per the data I personally have
   // @org.hibernate.annotations.BatchSize(size=50)
    
    
    // somewhat similar to the batch size with the size of 50
    @org.hibernate.annotations.Fetch(
    		org.hibernate.annotations.FetchMode.SUBSELECT
    		)
    @JoinColumn (name="clientid")
    private List<Pet> pets;
    
	public Owner() {
	}
	public Owner(String name) {
		super();
		this.name = name;
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
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
    
	
    
}
