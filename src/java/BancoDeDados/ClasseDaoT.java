/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Classes.TecnicoAdministrativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20131064110317
 */
public class ClasseDaoT {
    private Connection conn;

public ClasseDaoT(){
Conecxao conecxao = new Conecxao();
this.conn = conecxao.getConnection();
}
private String insert = "insertintoTecnicoAdministrativo (Nome, Senha,Confirmar_Senha,"
        + " Telefone, Email) values( ?, ?, ?, ?, ?);";

public int insertTecnicoAdministrativo(TecnicoAdministrativo novo){


try {
PreparedStatement statement;
statement = conn.prepareStatement(insert);

statement.setString(1, novo.getNome());
statement.setString(2, novo.getSenha());
statement.setString(3, novo.getConfirmarSenha());
statement.setInt(4, novo.getTelefone());
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


