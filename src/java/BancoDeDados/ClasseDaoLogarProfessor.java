/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Classes.Aluno;
import Classes.Professor;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20131064110317
 */
public class ClasseDaoLogarProfessor {
   Conecxao con = new Conecxao();
 Connection conn = con.getConnection();  
  Statement stmt;
public int logar(Professor Professores) {
int retorno = 0;

try {

            String Select = "Select * from Professor where nome='" 
+ Professores.getNome()
             + "' and senha='"
             + Professores.getSenha()+ "'";


stmt = conn.createStatement();
ResultSet resultado = stmt.executeQuery(Select);

if (resultado.next()) {
System.out.println("nome:" + resultado.getString("nome"));
System.out.println("senha:" + resultado.getString("senha"));
System.out.println();

retorno = 1;
            }
  } catch (SQLException ex) {
Logger.getLogger(ClasseDaoLogarProfessor.class.getName()).log(Level.SEVERE, 
null, ex);
        }
return retorno;
    }






    }










   

  

