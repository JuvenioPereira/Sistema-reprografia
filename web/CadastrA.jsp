<%-- 
    Document   : CadastrA
    Created on : 08/08/2014, 16:29:17
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
       <a href="PrincipalTela.jsp">Voltar a pagina principal</a>
<h2><o>Os campos abaixo devem ser preenchidos:</o></h2><br />
<img src ="aluno.png" align="leaft" width="60" height="80">
<br>
<br>
<form action="GerenciarUsuarioA"  method="post">
<b>Nome:</b><input type="text" name="txtNome" size="40" ><br />
<br>
<b>Matricula:</b><input type="password"size="20" name="txtMatricula" ><br />
<br>
Comfirmar Matricula:<br />
<br>
<b>ComfirmarMatricula:</b><input type="password"size="20" name="txtComfirmarMatricula" ><br />
<br>
<b>Telefone:</b><input type="text" name="txtTelefone" size="20" ><br />
<br>
<b>Email:</b><input type="text" name="txtEmail" size="40" ><br />
<br>
<input type="submit" value="Cadastrar"> <input type="submit" value="Cancelar">




</form>













    </body>
</html>
