package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaginaP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#C0C0C0\">\n");
      out.write("<center>\n");
      out.write("<h3>Seja bem vindo</h3>\n");
      out.write("</center>\n");
      out.write("<B><i>PROFESSOR</i></B><BR />\n");
      out.write("<img src=\"professor.jpg\"  width=\"100\"    height=\"150\">\n");
      out.write("<h3>Pedido de solicitacões</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("<b>Nome:</b><input type=\"text\" name=\"txtNome\" size=\"45\" value=\"\"><br />\n");
      out.write("<br>\n");
      out.write("<b>Senha:</b><input type=\"password\" name=\"txtSenha\"  size=\"25\"><br />\n");
      out.write("<br>\n");
      out.write("<b>Material: </b><br />\n");
      out.write("<textarea name=\"txtArea\" rows=\"10\" cols=\"50\"> </textarea><br />\n");
      out.write("<input type=\"reset\" value=\"Limpar\"><br />\n");
      out.write("<b>Quantidade: </b><br />\n");
      out.write("<textarea name=\"txtArea\" rows=\"1\" cols=\"6\">\n");
      out.write("</textarea><br />\n");
      out.write("<input type=\"reset\" value=\"Enviar\"><br />\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<b>Caixa de entrada: </b><br /> <textarea name=\"txtArea\" rows=\"15\" cols=\"60\"> </textarea><br /> <input type=\"submit\" value=\"Limpar\"> \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<b>Campo de mensagem: </b><br /> <textarea name=\"txtArea\" rows=\"15\" cols=\"60\"> </textarea><br /> <input type=\"submit\" value=\"Enviar\"> <input type=\"submit\" value=\"Cancelar\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<b>Gastos com materiais: </b><br /> \n");
      out.write("Semanalmente<br />\n");
      out.write("<textarea name=\"txtArea\" rows=\"2\" cols=\"4\"> </textarea><br /> <input type=\"submit\" value=\"Limpar\"><br />\n");
      out.write("<b>Gastos com materiais: </b><br /> \n");
      out.write("Mensalmente<br />\n");
      out.write("<textarea name=\"txtArea\" rows=\"2\" cols=\"4\"> </textarea><br /> <input type=\"submit\" value=\"Limpar\"> \n");
      out.write(" \n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
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
