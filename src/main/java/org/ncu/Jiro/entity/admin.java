package org.ncu.Jiro.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class admin {

	@Pattern(regexp = "^[a-zA-Z]*$", message="No special character allowed.")
	private String name;
	private int aid;
	private String pass;
	
	@Email
	private String email;
	@Pattern(regexp="^[0-9]{10}$", message="Only digits allowed & length 10")
	private String phn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	
	@Override
	public String toString() {
		return "admin [name=" + name + ", aid=" + aid + ", pass=" + pass + ", email=" + email + ", phn=" + phn + "]";
	}
}
