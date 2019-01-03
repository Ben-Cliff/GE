package cs.CO3098.MiniWeb.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.fasterxml.jackson.annotation.JsonProperty;
*/

//Uncomment annotations if you use Spring Data JPA

@Entity
public class Person {
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//@JsonProperty("m")
	public int getMotherKey() {
		return motherKey;
	}
	public void setMotherKey(int motherKey) {
		this.motherKey = motherKey;
	}
	//@JsonProperty("f")
	public int getFatherKey() {
		return fatherKey;
	}
	public void setFatherKey(int fatherKey) {
		this.fatherKey = fatherKey;
	}
	
	//@JsonProperty("dob")
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	//@JsonProperty("g")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Person(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}


	public Person(int key, String name, int motherKey, int fatherKey, int dateOfBirth, String gender) {
		super();
		this.key = key;
		this.name = name;
		this.motherKey = motherKey;
		this.fatherKey = fatherKey;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
	}


	
	//int key;	
	//String name;
	
	//int motherKey;
	//int fatherKey;
	//int DateOfBirth; //19921210->December 10th 1992 
	//String gender;
	
	
	@Id
	@GeneratedValue
	
	@Column(name="key")
	Integer key;
	
	@Column(name="name")
	String name;
	
	@Column(name="motherKey")
	Integer motherKey;
	
	@Column(name="fatherKey")
	Integer fatherKey;
	
	@Column(name="DateOfBirth")
	Integer DateOfBirth;
	
	
	@Column(name="gender")
	String gender;
	
	
	
	
	

}
