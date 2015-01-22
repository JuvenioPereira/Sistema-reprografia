package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PrincipalTela_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href= \"cssdaprimeiratela.css\" media=\"all\">  \n");
      out.write("        <title>SRJ</title>\n");
      out.write("    </head>\n");
      out.write("     <body  bgcolor=\"#C0C0C0\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"#\">Cadastro</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"CadastroP.jsp\">Professor</a></li>\n");
      out.write("<li><a href=\"CadastrA.jsp\"></a>Aluno</li>\n");
      out.write("<li><a href=\"CadastroFunc.jsp\"></a>Funcionário</li>\n");
      out.write("<li><a href=\"CadastrTéc.jsp\"></a>Técnico administrativo</li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"#\">Solicitações</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"LoginDeSolicitacao.jsp\"></a>Login</li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<li><a href=\"#\">Remover</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"RemoverP.jsp\">Professor</a></li>\n");
      out.write("<li><a href=\"RemoverA.jsp\">Aluno</a></li>\n");
      out.write("<li><a href=\"RemoverF.jsp\">Funcionário</a></li>\n");
      out.write("<li><a href=\"RemoverT.jsp\">Técnico administrativo</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li><a href=\"#\">Professor</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"LoginDeProfessor.jsp\">Login</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li><a href=\"#\">Aluno</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"LoginDeAluno.jsp\">Login</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li><a href=\"#\">Funcionário</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"LoginDeFuncionario.jsp\">Login</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li><a href=\"#\">Técnico administrativo</a>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"LoginDoTec.jsp\">Login</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li><a href=\"http://www.google.com.br/firefox\">Sair</a>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<b> PROFESSOR</br><br />\n");
      out.write("    <a href=\"LoginDeProfessor.jsp\">\n");
      out.write(" <img src = \"professor.jpg\"  width=\"90\" height=\"100\">\n");
      out.write(" </a>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" ALUNO<br />\n");
      out.write("  <a href=\"LoginDeAluno.jsp\">\n");
      out.write(" <img src = \"aluno.png\"  width=\"90\" height=\"100\">\n");
      out.write("  </a>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("FUNCIONARIO</br>\n");
      out.write(" <a href=\"LoginDeFuncionario.jsp\">\n");
      out.write(" <img src = \"func.png\"  width=\"90\" height=\"100\">\n");
      out.write(" </a>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("TÉCNICO<br />\n");
      out.write("ADMINISTRATIVO<br />\n");
      out.write("<a href=\"LoginDoTec.jsp\">\n");
      out.write(" <img src = \"Tec.jpg\"  width=\"90\" height=\"100\">\n");
      out.write("</a>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("SOLICITAÇÕES<br />\n");
      out.write("<a href=\"LoginDeSolicitacao.jsp\">\n");
      out.write(" <img src = \"S.jpeg\"  width=\"90\" height=\"100\">\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("     \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
