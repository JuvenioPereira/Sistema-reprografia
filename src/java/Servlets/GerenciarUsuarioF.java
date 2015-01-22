/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BancoDeDados.ClasseDaoF;
import Classes.Funcionario;
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
@WebServlet(name = "GerenciarUsuarioF", urlPatterns = {"/GerenciarUsuarioF"})
public class GerenciarUsuarioF extends HttpServlet {

   
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
       Funcionario funcionario = new Funcionario();

       String Nome =  request.getParameter("txtNome");
       String Senha=  request.getParameter("txtSenha");
       String comfirmarSenha= request.getParameter("txtComfirmarSenha");
       String Telefone = request.getParameter("txtTelefone");
       String Email = request.getParameter("txtEmail");

funcionario.setNome(Nome);
funcionario.setSenha(Senha);
funcionario.setComfirmarSenha(comfirmarSenha);
funcionario.setTelefone(Telefone);
funcionario.setEmail(Email);



ClasseDaoF cadastro = new ClasseDaoF();
int retorno = cadastro.insertFuncionario(funcionario);

if(retorno == 1){

response.sendRedirect("ComfirmacaoP.jsp");

}else{}  

response.sendRedirect("ErrorP.jsp");

      }








        
        
        
        
    }


