package org.ncu.Jiro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.Jiro.entity.admin;
import org.springframework.jdbc.core.RowMapper;

public class adminRowMapper implements RowMapper<admin> {

	@Override
	public admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		admin a=new admin();
		a.setName(rs.getString(1));
		a.setAid(rs.getInt(2));
		a.setPass(rs.getString(3));
		a.setEmail(rs.getString(4));
		a.setPhn(rs.getString(5));
		return a;
	}

	
	
}
