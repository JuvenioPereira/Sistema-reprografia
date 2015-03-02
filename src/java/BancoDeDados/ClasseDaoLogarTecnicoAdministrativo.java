/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Classes.Professor;
import Classes.TecnicoAdministrativo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20131064110317
 */
public class ClasseDaoLogarTecnicoAdministrativo {
     Conecxao con = new Conecxao();
 Connection conn = con.getConnection();  
  Statement stmt;
public int logar(TecnicoAdministrativo TecnicoAd) {
int retorno = 0;

try {

            String Select = "Select * from TecnicoAdministrativo where nome='" 
+ TecnicoAd.getNome()
             + "' and senha='"
             + TecnicoAd.getSenha()+ "'";


stmt = conn.createStatement();
ResultSet resultado = stmt.executeQuery(Select);

if (resultado.next()) {
System.out.println("nome:" + resultado.getString("nome"));
System.out.println("senha:" + resultado.getString("senha"));
System.out.println();

retorno = 1;
            }
  } catch (SQLException ex) {
Logger.getLogger(ClasseDaoLogarTecnicoAdministrativo.class.getName()).log(Level.SEVERE, 
null, ex);
        }
return retorno;
    }






    }





