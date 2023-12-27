package org.ncu.Jiro.dao;

import java.util.List;

import org.ncu.Jiro.entity.admin;
import org.ncu.Jiro.entity.project;
import org.ncu.Jiro.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class daoAdminImp implements daoAdmin {

	@Autowired
	JdbcTemplate temp;
	
	@Override
	public admin fetchAdmin(int id) {
		String s="select *from admin where aid="+id;
		return temp.queryForObject(s, new adminRowMapper());
	}
		

	@Override
	public int updateAdmin(int id,admin a) {
		String s="update admin set name=?,email=?,phn=? where aid=?";
		Object[] ar= {a.getName(),a.getEmail(),a.getPhn(),id};
		return temp.update(s,ar);
	}

	@Override
	public int insertProject(project p) {
		String s="insert into project values(?,?,?,?,?,?)";
		Object[] arr= {p.getName(),p.getPid(),p.getReporter(),p.getStatus(),p.getLevel(),p.getPriority()};
		return temp.update(s,arr);
	}

	@Override
	public int deleteProject(int id) {
		String s="delete from project where pid="+id;
		return temp.update(s);
	}

	@Override
	public int updateProject(int id,project p) {
		String s="update project set reporter=?,status=?,level=?,priority=? where pid=?";
		Object[] arr= {p.getReporter(),p.getStatus(),p.getLevel(),p.getPriority(),id};
		return temp.update(s,arr);
	}

	@Override
	public List<project> fetchAllProjects() {
		String s="select *from project";
		return temp.query(s, new projectRowMapper());
	}


	@Override
	public List<user> fetchassigne(int id) {
		String s="select uid,name, email from (works_on natural join user) where pid="+id;
		return temp.query(s, new userRowMapper());
	}


	@Override
	public int deleteAssigne(int id) {
		String s="delete from works_on where uid="+id;
		return temp.update(s);
	}


	@Override
	public int insertAssigne(int id, int uid) {
		String s="insert into works_on values(?,?)";
		Object[] arr= {id,uid};
		return temp.update(s,arr);
	}




}
