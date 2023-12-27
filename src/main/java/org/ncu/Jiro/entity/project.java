package org.ncu.Jiro.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class project {

	private int pid;
	@Pattern(regexp = "^[a-zA-Z]*$", message="No special character allowed.")
	private String name;
	@NotEmpty(message = "Required")
	private String reporter;
	@NotEmpty(message = "Required")
	private String status;
	@NotEmpty(message = "Required")
	private String level;
	@NotEmpty(message = "Required")
	private String priority;
	
	private String comment;
	private List<String> comments;
	private Map<String,String> statusOptions;
	private Map<String,String> leveloptions;
	private Map<String,String> priorityoption;
	
	public project() {
		
		statusOptions=new HashMap<>();
		statusOptions.put("To-Do", "To-Do");
		statusOptions.put("In-Progress", "In-Progress");
		statusOptions.put("Completed", "Completed");
		
		leveloptions=new HashMap<>();
		leveloptions.put("Easy", "Easy");
		leveloptions.put("Mid", "Medium");
		leveloptions.put("Diff", "Difficult");
		
		priorityoption =new HashMap<>();
		priorityoption.put("1", "1");
		priorityoption.put("2", "2");
		priorityoption.put("3", "3");
		priorityoption.put("4", "4");
		priorityoption.put("5", "5");
		priorityoption.put("6", "6");
		priorityoption.put("7", "7");
		priorityoption.put("8", "8");
		priorityoption.put("9", "9");
		priorityoption.put("10", "10");
		
	}
	
	public Map<String, String> getStatusOptions() {
		return statusOptions;
	}
	public void setStatusOptions(Map<String, String> statusOptions) {
		this.statusOptions = statusOptions;
	}
	public Map<String, String> getLeveloptions() {
		return leveloptions;
	}
	public void setLeveloptions(Map<String, String> leveloptions) {
		this.leveloptions = leveloptions;
	}

	
	public Map<String, String> getPriorityoption() {
		return priorityoption;
	}
	public void setPriorityoption(Map<String, String> priorityoption) {
		this.priorityoption = priorityoption;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "project [pid=" + pid + ", name=" + name + ", reporter=" + reporter + ", status=" + status + ", level="
				+ level + ", priority=" + priority + ", comment=" + comment + ", comments=" + comments
				+ ", statusOptions=" + statusOptions + ", leveloptions=" + leveloptions + ", priorityoption="
				+ priorityoption + "]";
	} 
	
	
	
}
