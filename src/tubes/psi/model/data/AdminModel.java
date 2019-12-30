/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.model.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tubes.psi.model.pojo.Admin;
import tubes.psi.model.pojo.User;
import tubes.psi.utilities.DatabaseUtilities;

/**
 *
 * @author A412FL
 */
public class AdminModel {
    public List<Admin> loadAdmins() throws SQLException {
        List<Admin> adminList;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM admin");
            adminList = new ArrayList<>();
            while (rs.next()) {
                Admin admin = new Admin();
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                
                adminList.add(admin);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return adminList;
    }
}
            
            
            
//            while (rs.next()) {
//                Admin admin = new Admin();
//                user.setNama(rs.getString("nama"));
//                user.setPassword(rs.getString("password"));
//                user.setBilling(rs.getString("id_billing"));
//                userList.add(user);
//            }
//        } finally {
//            if (con != null) {
//                con.close();
//            }
//        }
//    }

