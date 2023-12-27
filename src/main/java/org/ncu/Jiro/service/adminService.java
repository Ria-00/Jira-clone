package org.ncu.Jiro.service;

import java.util.List;

import org.ncu.Jiro.entity.admin;
import org.ncu.Jiro.entity.project;
import org.ncu.Jiro.entity.user;

public interface adminService {

	public admin getRecord(int id);
	public int updateAdminRecord(int id,admin a);
	public int insertRecord(project p);
	public int deleteRecord(int id);
	public int updateRecord(int id,project p);
	public List<project> fetchAllRecords();
	public List<user> getAssigne(int id);
	public int deleteAssigneRec(int id);
	public int insertAssigneRec(int id,int uid);
}
