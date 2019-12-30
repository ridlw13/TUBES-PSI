/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.main;

import java.sql.SQLException;
import tubes.psi.view.HalamanAdminFrame;

/**
 *
 * @author A412FL
 */
public class MainProgram {
    public static void main(String[] args) throws SQLException {
        new HalamanAdminFrame().setVisible(true);
    }
}
