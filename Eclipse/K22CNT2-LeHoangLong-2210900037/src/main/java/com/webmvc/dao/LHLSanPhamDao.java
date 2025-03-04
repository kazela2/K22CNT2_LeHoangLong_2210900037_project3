package com.webmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.webmvc.users.LHLSanPham;

@Repository
public class LHLSanPhamDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int update(LHLSanPham p) {
		String sql = "UPDATE lhl_sanpham SET "
		        + "lhl_tensp = ?, "
		        + "lhl_danhmuc = ?, "
		        + "lhl_mota = ?, "
		        + "lhl_gia = ? "
		        + "WHERE lhl_masp = ?";

	    return template.update(sql, p.getLhl_tensp(), p.getLhl_danhmuc(), p.getLhl_mota(), p.getLhl_gia(), p.getLhl_masp());
	}

	public int save(LHLSanPham p) {
	    String sql = "INSERT INTO lhl_sanpham (lhl_tensp, lhl_danhmuc, lhl_mota, lhl_gia) VALUES (?, ?, ?, ?)";
	    return template.update(sql, p.getLhl_tensp(), p.getLhl_danhmuc(), p.getLhl_mota(), p.getLhl_gia());
	}


	public int delete(int id) {
		String sql = "delete from lhl_sanpham where lhl_masp=" + id + "";
		return template.update(sql);
	}

	public LHLSanPham getEmpById(int id) {
		String sql = "select * from lhl_sanpham where lhl_masp=?";
		LHLSanPham sanpham = template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<LHLSanPham>(LHLSanPham.class));
	    System.out.println(sanpham); 
	    return sanpham;
	}

	public List<LHLSanPham> getEmployees() {
	    return template.query("select * from lhl_sanpham", new RowMapper<LHLSanPham>() {
	        public LHLSanPham mapRow(ResultSet rs, int row) throws SQLException {
	            LHLSanPham e = new LHLSanPham();
	            e.setLhl_masp(rs.getInt("lhl_masp")); 
	            e.setLhl_tensp(rs.getString("lhl_tensp"));
	            e.setLhl_danhmuc(rs.getString("lhl_danhmuc"));
	            e.setLhl_mota(rs.getString("lhl_mota"));
	            e.setLhl_gia(rs.getBigDecimal("lhl_gia"));  
	            return e;
	        }
	    });
	}
}
