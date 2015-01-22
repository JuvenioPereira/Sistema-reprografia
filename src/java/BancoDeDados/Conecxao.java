/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 20131064110317
 */
public class Conecxao {
    public Connection getConnection() {
    Connection  Conecxao=null;
       try {
       Class.forName("com.mysql.jdbc.Driver");
        Conecxao=DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador","root","fernanda");

       }catch(Exception e) {
          e.printStackTrace();
}
return Conecxao;
    }
}    



