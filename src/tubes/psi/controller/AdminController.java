/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.controller;

import java.sql.SQLException;
import java.util.List;
import tubes.psi.model.data.AdminModel;
import tubes.psi.model.data.UserModel;
import tubes.psi.model.pojo.Admin;
import tubes.psi.model.pojo.User;

/**
 *
 * @author A412FL
 */
public class AdminController {
    public List<Admin> loadAdmin() throws SQLException{
        AdminModel model = new AdminModel();
        return model.loadAdmins();
}
}
