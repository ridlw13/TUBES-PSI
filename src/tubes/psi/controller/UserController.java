/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.controller;

import java.sql.SQLException;
import java.util.List;
import tubes.psi.model.data.UserModel;
import tubes.psi.model.pojo.Admin;
import tubes.psi.model.pojo.User;

/**
 *
 * @author A412FL
 */
public class UserController {
    public List<User> loadUser() throws SQLException{
        UserModel model = new UserModel();
        return model.loadUsers();
    }
    public int insert(User user) throws SQLException{
        UserModel model = new UserModel();
        return model.save(user);
    }
    public int hapus(User user) throws SQLException {
        UserModel model = new UserModel();
        return model.delete(user);
    }
}
