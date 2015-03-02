<%-- 
    Document   : PaginaT
    Created on : 08/08/2014, 16:37:30
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
<center>
<h3>Seja bem vindo</h3>
</center>
<B><i>Técnico administrativo</i></B><BR />
<img src="Tec.jpg"  width="100"    height="150">
<h3>Pedido de solicitacões</h3>


<form>
<b>Nome:</b><input type="text" name="txtNome" size="45" value=""><br />
<br>
<b>Senha:</b><input type="password" name="txtSenha"  size="25"><br />
<br>
<b>Material: </b><br />
<textarea name="txtArea" rows="10" cols="50"> </textarea><br />
<input type="reset" value="Limpar"><br />
<b>Quantidade: </b><br />
<textarea name="txtArea" rows="1" cols="6">
</textarea><br />
<input type="reset" value="Enviar"><br />
<br>
<br>
<br>
<b>Caixa de entrada: </b><br /> <textarea name="txtArea" rows="15" cols="60"> </textarea><br /> <input type="submit" value="Limpar"> 
<br>
<br>
 <b> Enviar mensagem:</b><br />
<b>Remetente:</b><input type="text" name="txtNome" size="45" value="">
<br>
<b>Destinatário:</b><input type="password" name="txtSenha"  size="25"><br />
</form>
<b><br /> <textarea name="txtArea" rows="15" cols="60"> </textarea><br /> <input type="submit" value="Enviar"> <input type="submit" value="Cancelar">
<br>
<br>


<b>Gastos com materiais: </b><br /> 
Semanalmente<br />
<textarea name="txtArea" rows="2" cols="4"> </textarea><br /> <input type="submit" value="Limpar"><br />
<b>Gastos com materiais: </b><br /> 
Mensalmente<br />
<textarea name="txtArea" rows="2" cols="4"> </textarea><br /> <input type="submit" value="Limpar"> 
 

</form>
<br>
<br>

 Clique <a href="PrincipalTela.jsp">aqui</a> para sair <br />


    </body>
</html>
