/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Classes.Aluno;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 20131064110317
 */
public class ClasseDaoLogarA {
 Conecxao con = new Conecxao();
 Connection conn = con.getConnection();  
  Statement stmt;
public int logar(Aluno alunos) {
int retorno = 0;

try {

            String Select = "Select * from aluno where nome='" 
+ alunos.getNome()
             + "' and matricula='"
             + alunos.getMatricula()+ "'";


stmt = conn.createStatement();
ResultSet resultado = stmt.executeQuery(Select);

if (resultado.next()) {
System.out.println("nome:" + resultado.getString("nome"));
System.out.println("matricula:" + resultado.getString("matricula"));
System.out.println();

retorno = 1;
            }
  } catch (SQLException ex) {
Logger.getLogger(ClasseDaoLogarA.class.getName()).log(Level.SEVERE, 
null, ex);
        }
return retorno;
    }






    }










   

