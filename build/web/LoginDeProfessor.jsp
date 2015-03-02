<%-- 
    Document   : LoginDeProfessor
    Created on : 08/08/2014, 16:47:52
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body bgcolor="#C0C0C0">
       <a href="PrincipalTela.jsp">Voltar a pagina principal</a><br />
       <br>
<img src="professor.jpg" width="70" heigth="90">
<br>
<br>
<form action="PaginaP.jsp">
<b>Nome:</b> <input type="text"name="txtNome"size="40">
<br>
<br>
<b>Senha:</b><input type="password"name="txtSenha"><br />
<input type="submit" value="OK">
</form>



    </body>
</html>
