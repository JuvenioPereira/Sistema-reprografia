/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 20131064110317
 */
public class Professor {
    String Nome;
String Senha;
String Telefone;
String Email;
int GastoSemanais;
int GastoMensais;
String ConfirmarSenha;

    public String getConfirmarSenha() {
        return ConfirmarSenha;
    }

    public void setConfirmarSenha(String ConfirmarSenha) {
        this.ConfirmarSenha = ConfirmarSenha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getGastoMensais() {
        return GastoMensais;
    }

    public void setGastoMensais(int GastoMensais) {
        this.GastoMensais = GastoMensais;
    }

    public int getGastoSemanais() {
        return GastoSemanais;
    }

    public void setGastoSemanais(int GastoSemanais) {
        this.GastoSemanais = GastoSemanais;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

}


