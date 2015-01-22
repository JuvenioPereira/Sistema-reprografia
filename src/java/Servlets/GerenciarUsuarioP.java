/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BancoDeDados.ClasseDaoP;
import Classes.Professor;
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
@WebServlet(name = "GerenciarUsuarioP", urlPatterns = {"/GerenciarUsuarioP"})
public class GerenciarUsuarioP extends HttpServlet {

  
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
                  Professor professor = new Professor();

       String Nome =  request.getParameter("txtNome");
       String Senha=  request.getParameter("txtSenha");
       String comfirmarSenha= request.getParameter("txtComfirmarSenha");
       String telefone = request.getParameter("txtTelefone");
       String Email = request.getParameter("txtEmail");

professor.setNome(Nome);
professor.setSenha(Senha);
professor.setConfirmarSenha(comfirmarSenha);
professor.setTelefone(telefone);
professor.setEmail(Email);



ClasseDaoP cadastro = new ClasseDaoP();
int retorno = cadastro.insertProfessor(professor);

if(retorno == 1){

response.sendRedirect("ComfirmacaoP.jsp");

}else{}  

response.sendRedirect("ErrorP.jsp");

      }



    }

       
       
       
       
    

    
  

