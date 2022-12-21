package com.demo.LoanApp.Model;

import java.util.Objects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "userdata")
public class usermodel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="mobilenumber")
    private String mobilenumber;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private int age;
    @Column(name="customerid")
    private String customerid;
    @Column(name="accountnumber")
    private String accountnumber;
    @Column(name="ifsccode")
    private String ifsccode;
    @Column(name="cibilscore")
    private String cibilscore;
    @Column (name="gender")
    private String gender;
    
    private usermodel() {

    }
    

 


    

    public usermodel(String name, String password, String mobilenumber, String email, int age, String customerid,
			String accountnumber, String ifsccode, String cibilscore, String gender) {
		
		this.name = name;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.age = age;
		this.customerid = customerid;
		this.accountnumber = accountnumber;
		this.ifsccode = ifsccode;
		this.cibilscore = cibilscore;
		this.gender = gender;
	}







	public usermodel(Long id, String name, String password, String mobilenumber, String email, int age,
			String customerid, String accountnumber, String ifsccode, String cibilscore, String gender) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.age = age;
		this.customerid = customerid;
		this.accountnumber = accountnumber;
		this.ifsccode = ifsccode;
		this.cibilscore = cibilscore;
		this.gender = gender;
	}







	public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getPassword() {
		return password;
	}







	public void setPassword(String password) {
		this.password = password;
	}







	public String getMobilenumber() {
		return mobilenumber;
	}







	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public int getAge() {
		return age;
	}







	public void setAge(int age) {
		this.age = age;
	}







	public String getCustomerid() {
		return customerid;
	}







	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}







	public String getAccountnumber() {
		return accountnumber;
	}







	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}







	public String getIfsccode() {
		return ifsccode;
	}







	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}







	public String getCibilscore() {
		return cibilscore;
	}







	public void setCibilscore(String cibilscore) {
		this.cibilscore = cibilscore;
	}







	public String getGender() {
		return gender;
	}







	public void setGender(String gender) {
		this.gender = gender;
	}







	@Override
	public int hashCode() {
		return Objects.hash(accountnumber, age, cibilscore, customerid, email, gender, id, ifsccode, mobilenumber, name,
				password);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		usermodel other = (usermodel) obj;
		return Objects.equals(accountnumber, other.accountnumber) && age == other.age
				&& Objects.equals(cibilscore, other.cibilscore) && Objects.equals(customerid, other.customerid)
				&& Objects.equals(email, other.email) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(ifsccode, other.ifsccode)
				&& Objects.equals(mobilenumber, other.mobilenumber) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}







	@Override
    public String toString() {
         final StringBuilder sb = new StringBuilder("UserDetail{");
            sb.append("id=").append(id);
            sb.append(", name='").append(name).append('\'');
            sb.append(", email='").append(email).append('\'');
            sb.append(", mobilenumber='").append(mobilenumber).append('\'');
            sb.append(", age='").append(age).append('\'');
            sb.append(", customerid='").append(customerid).append('\'');
            sb.append(", accountnumber='").append(accountnumber).append('\'');
            sb.append(", ifsccode='").append(ifsccode).append('\'');
            sb.append(", cibilscore='").append(cibilscore).append('\'');
            sb.append(", gender='").append(gender).append('\'');
            
            sb.append('}');
            return sb.toString();
    }
}