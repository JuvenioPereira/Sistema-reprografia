/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20131064110317
 */
public class ClasseDaoA {
    
           private Connection conn;

public ClasseDaoA(){
            //Instância da classe Conecxao
Conecxao conecxao = new Conecxao();
            //Pegando a conecxao
this.conn = conecxao.getConnection();
                }
        //Inserindo usuário Aluno no banco de dados
private String insert = "insertinto aluno(nome, matricula,comfirmar_Matricula,"
        + " telefone,email) values( ?, ?, ?, ?, ?);";

public int insertaluno(Aluno novo){


try {
PreparedStatement statement;
statement = conn.prepareStatement(insert);

statement.setString(1, novo.getNome());
statement.setString(2, novo.getMatricula());
statement.setString(3, novo.getConfirmaMatricula());
statement.setString(4, novo.getTelefone());
statement.setString(5, novo.getEmail());

int retorno = statement.executeUpdate();

if(retorno == 1){
return 1;
            } 
statement.close();
conn.close();
        } catch (SQLException ex) {
Logger.getLogger(ClasseDaoA.class.getName()).log(Level.SEVERE, null,
ex);
        }
return 0;


}     












}     


