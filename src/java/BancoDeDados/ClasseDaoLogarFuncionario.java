/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Classes.Aluno;
import Classes.Funcionario;
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
public class ClasseDaoLogarFuncionario {
     Conecxao con = new Conecxao();
 Connection conn = con.getConnection();  
  Statement stmt;
public int logar(Funcionario Funcionarios) {
int retorno = 0;

try {

            String Select = "Select * from funcionario where nome='" 
+ Funcionarios.getNome()
             + "' and senha='"
             + Funcionarios.getSenha()+ "'";


stmt = conn.createStatement();
ResultSet resultado = stmt.executeQuery(Select);

if (resultado.next()) {
System.out.println("nome:" + resultado.getString("nome"));
System.out.println("matricula:" + resultado.getString("matricula"));
System.out.println();

retorno = 1;
            }
  } catch (SQLException ex) {
Logger.getLogger(ClasseDaoLogarFuncionario.class.getName()).log(Level.SEVERE, 
null, ex);
        }
return retorno;
    }






    }










   



