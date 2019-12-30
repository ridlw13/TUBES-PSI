/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.model.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tubes.psi.model.pojo.User;
import tubes.psi.utilities.DatabaseUtilities;

/**
 *
 * @author A412FL
 */
public class UserModel {
    public List<User> loadUsers() throws SQLException {
        List<User> userList;
        Connection con = DatabaseUtilities.getConnection();

        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM transaksi");
            userList = new ArrayList<>();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setNama(rs.getString("nama_user"));
                user.setBilling(rs.getString("waktu"));
                user.setPc(rs.getString("pc"));
                user.setHarga(rs.getString("harga"));
                user.setTanggal(rs.getString("tanggal"));
                user.setJam_mulai(rs.getString("jam_mulai"));
                user.setJam_berhenti(rs.getString("jam_berhenti"));
                userList.add(user);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return userList;
    }
    
    public int save(User user) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO transaksi values(?,?,?,?,?,?,?,?)");
            stat.setString(1,user.getId());
            stat.setString(2, user.getNama());
            stat.setString(3, user.getBilling());
            stat.setString(4, user.getPc());
            stat.setString(5,user.getHarga());
            stat.setString(6, user.getTanggal());
            stat.setString(7,user.getJam_mulai());
            stat.setString(8,user.getJam_berhenti());
            
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                
                con.close();
            }
        }
    }
    
    public int delete(User user) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("DELETE FROM transaksi WHERE id=?");
            stat.setString(1, user.getId());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
