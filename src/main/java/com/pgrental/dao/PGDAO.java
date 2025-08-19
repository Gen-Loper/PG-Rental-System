package com.pgrental.dao;

import com.pgrental.model.PG;
import com.pgrental.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PGDAO {
	public static boolean addPG(PG pg) {
	    try (Connection conn = DBConnection.getConnection()) {
	        String sql = "INSERT INTO pgs (name, address, rent, description, user_id) VALUES (?, ?, ?, ?, ?)";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setString(1, pg.getName());
	        stmt.setString(2, pg.getAddress());
	        stmt.setInt(3, pg.getRent());
	        stmt.setString(4, pg.getDescription());
	        stmt.setInt(5, pg.getUserId()); // ✅ Set user_id

	        int rowsInserted = stmt.executeUpdate();
	        return rowsInserted > 0;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

    
	public static List<PG> getPGsByUserId(int userId) {
	    List<PG> pgList = new ArrayList<>();
	    try (Connection conn = DBConnection.getConnection()) {
	        String sql = "SELECT * FROM pgs WHERE user_id = ?";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, userId);
	        ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	            PG pg = new PG();
	            pg.setUserId(rs.getInt("user_id"));
	            pg.setName(rs.getString("name"));
	            pg.setAddress(rs.getString("address"));
	            pg.setRent(rs.getInt("rent"));
	            pg.setDescription(rs.getString("description"));
	            pg.setUserId(userId);
	            pgList.add(pg);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return pgList;
	}

}
