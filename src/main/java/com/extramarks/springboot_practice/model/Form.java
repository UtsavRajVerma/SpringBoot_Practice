package com.extramarks.springboot_practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "form")
public class Form {
	@Transient
	public static final String SEQUENCE_NAME="userSequence";
	
    @Id
    private long id;
    
    private String name;
    private String email;
    private String mobile;
    private String state;
    private String gender;
    private String skills;

    public Form(String name, String email, String mobile, String state, String gender, String skills) {
        super();
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.state = state;
        this.gender = gender;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
}
