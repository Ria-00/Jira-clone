package org.ncu.Jiro.service;

import java.util.List;

import org.ncu.Jiro.dao.daoAdminImp;
import org.ncu.Jiro.entity.admin;
import org.ncu.Jiro.entity.project;
import org.ncu.Jiro.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminserviceImp implements adminService {

	@Autowired
	daoAdminImp dao;
	
	@Override
	public admin getRecord(int id) {
		return dao.fetchAdmin(id);
			
	}

	@Override
	public int updateAdminRecord(int id, admin a) {
		int i= dao.updateAdmin(id,a);
		if (i>0) {
			return i;
		} else {
			return 0;
		}
	}
	
	@Override
	public int insertRecord(project p) {
		int i=dao.insertProject(p);
		if (i!=0) {
			return i;
		} else {
			return 0;
		}
	}

	@Override
	public int deleteRecord(int id) {
		int i=dao.deleteProject(id);
		if (i!=0) {
			return i;
		} else {
			return 0;
		}
	}

	@Override
	public int updateRecord(int id,project p) {
		int i=dao.updateProject(id, p);
		if (i!=0) {
			return i;
		} else {
			return 0;
		}
	}

	@Override
	public List<project> fetchAllRecords() {
		List<project> p=dao.fetchAllProjects();
		if (p!=null) {
			return p;
		} else {
			return null;
		}
		
	}

	@Override
	public List<user> getAssigne(int id) {
		List<user> u=dao.fetchassigne(id);
		if (u!=null) {
			return u;
		} else {
			return null;
		}
	}

	@Override
	public int deleteAssigneRec(int id) {
		int i=dao.deleteAssigne(id);
		if (i!=0) {
			return i;
		} else {
			return 0;
		}

	}

	@Override
	public int insertAssigneRec(int id, int uid) {
		int i=dao.insertAssigne(id,uid);
		if (i!=0) {
			return i;
		} else {
			return 0;
		}
	}

	

}
