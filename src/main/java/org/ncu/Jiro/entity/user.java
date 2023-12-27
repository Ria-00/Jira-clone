package org.ncu.Jiro.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class user {

	@Pattern(regexp = "^{2,30}(.*[a-z])(.*[A-Z])*$", message="No special character allowed.")
	private String name;
	
	private int uid;
	
	@Pattern(regexp="^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message="At least one special character/lowercase/uppercase/digit required.")
	private String pass;
	
	@Email
	private String email;
	
	@Pattern(regexp="^[0-9]{10}$", message="Only digits allowed ")
	private String phn;
	
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "user [name=" + name + ", uid=" + uid + ", pass=" + pass + ", email=" + email + ", phn=" + phn + "]";
	}
	
	
}
