/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BancoDeDados.ClasseDaoT;
import Classes.TecnicoAdministrativo;
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
@WebServlet(name = "GerenciarUsuarioT", urlPatterns = {"/GerenciarUsuarioT"})
public class GerenciarUsuarioT extends HttpServlet {

   
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
       TecnicoAdministrativo TecnicoAd = new TecnicoAdministrativo() ;

       String Nome =  request.getParameter("txtNome");
       String Senha=  request.getParameter("txtSenha");
       String comfirmarSenha= request.getParameter("txtComfirmarSenha");
       String Telefone = request.getParameter("txtTelefone");
       String Email = request.getParameter("txtEmail");

TecnicoAd.setNome(Nome);
TecnicoAd.setSenha(Senha);
TecnicoAd.setComfirmarSenha(comfirmarSenha);
TecnicoAd.setTelefone(Telefone);
TecnicoAd.setEmail(Email);



ClasseDaoT cadastro = new ClasseDaoT();
int retorno = cadastro.insertTecnicoAdministrativo(TecnicoAd);

if(retorno == 1){

response.sendRedirect("ComfirmacaoT.jsp");

}else{}  

response.sendRedirect("ErrorT.jsp");

    }     
        
    }

  

