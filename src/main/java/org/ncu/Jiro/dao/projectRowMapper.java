package org.ncu.Jiro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.ncu.Jiro.entity.project;
import org.springframework.jdbc.core.RowMapper;

public class projectRowMapper implements RowMapper<project> {

	@Override
	public project mapRow(ResultSet rs, int rowNum) throws SQLException {
		project p=new project();
		p.setName(rs.getString(1));
		p.setPid(rs.getInt(2));
		p.setReporter(rs.getString(3));
		p.setStatus(rs.getString(4));
		p.setLevel(rs.getString(5));
		p.setPriority(rs.getString(6));
		return p;
	}

	
	
}
