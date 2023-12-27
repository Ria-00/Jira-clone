package org.ncu.Jiro.dao;

import java.util.List;

import org.ncu.Jiro.entity.admin;
import org.ncu.Jiro.entity.project;
import org.ncu.Jiro.entity.user;

public interface daoAdmin {

	public admin fetchAdmin(int id);
	public int updateAdmin(int id,admin a);
	public int insertProject(project p);
	public int deleteProject(int id);
	public int updateProject(int id,project p);
	public List<project> fetchAllProjects();
	public List<user> fetchassigne(int id);
	public int deleteAssigne(int id);
	public int insertAssigne(int id,int uid);
	
}
