package org.ncu.Jiro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.ncu.Jiro.entity.user;
import org.springframework.jdbc.core.RowMapper;

public class userRowMapper implements RowMapper<user> {

	@Override
	public user mapRow(ResultSet rs, int rowNum) throws SQLException {
		user u=new user();
		u.setUid(rs.getInt(1));
		u.setName(rs.getString(2));
		u.setEmail(rs.getString(3));
		return u;
	}

	
	
}
