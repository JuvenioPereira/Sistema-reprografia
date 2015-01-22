/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BancoDeDados.ClasseDaoA;
import Classes.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 20131064110317
 */
@WebServlet(name = "GerenciarUsuarioA", urlPatterns = {"/GerenciarUsuarioA"})
public class GerenciarUsuarioA extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
        } finally {            
            out.close();
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                Aluno aluno = new Aluno();
        //Recuperando os parametros do Aluno
String Nome =  request.getParameter("txtNome");
String Matricula =  request.getParameter("txtMatricula");
String ComfirmarMatricula= request.getParameter("txtComfirmarMatricula");
String Telefone = request.getParameter("txtTelefone");
String Email = request.getParameter("txtEmail");
//Setando os parametros do Aluno
aluno.setNome(Nome);
aluno. setMatricula(Matricula);
aluno.setConfirmaMatricula(ComfirmarMatricula);
aluno.setTelefone(Telefone);
aluno.setEmail(Email);
       //Isntânciando a classe Dao do Aluno e verificando se o aluno foi ,
       //cadastrado com sucesso.
ClasseDaoA cadastro = new ClasseDaoA();
int retorno = cadastro.insertaluno(aluno);

if(retorno == 1){

response.sendRedirect("comfirmacaoA.jsp");

}else{

response.sendRedirect("ErrorAluno.jsp");

      }





 }
}












        
        
        
        
        
       
    

  

